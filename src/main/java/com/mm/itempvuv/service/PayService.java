package com.mm.itempvuv.service;

import com.mm.itempvuv.common.util.DateUtil;
import com.mm.itempvuv.common.util.PageableUtil;
import com.mm.itempvuv.jpa.ads.model.AdsOfflinePayModel;
import com.mm.itempvuv.jpa.ads.repository.AdsOfflinePayRepository;
import com.mm.itempvuv.jpa.qbi.model.OfflinePayModel;
import com.mm.itempvuv.jpa.qbi.model.PayModel;
import com.mm.itempvuv.jpa.qbi.model.RealtimePayModel;
import com.mm.itempvuv.jpa.qbi.repository.OfflinePayRepository;
import com.mm.itempvuv.jpa.qbi.repository.RealtimePayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class PayService {

    @Autowired
    private OfflinePayRepository offlinePayRepository;
    @Autowired
    private RealtimePayRepository realtimePayRepository;
    @Autowired
    private AdsOfflinePayRepository adsOfflinePayRepository;

    private List<AdsOfflinePayModel> getAdsOfflinePayData() throws Exception {
        Pageable pageable = PageableUtil.getPageableDesc("channelName", 0, 1000);
        String t1 = "2019-01-10 00:00:00";
        String t2 = DateUtil.getDateStrBeforeToday(0) + " 00:00:00";
        return adsOfflinePayRepository.findByDs(t1, t2, pageable);
    }

    private List<OfflinePayModel> getOfflinePayData() throws Exception {
        Pageable pageable = PageableUtil.getPageableDesc("channelName", 0, 1000);
        Date ds1 = new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-10");
        Date ds2 = DateUtil.getDateBeforeToday(1);
        return offlinePayRepository.findByDs(ds1, ds2, pageable);
    }

    private List<RealtimePayModel> getRealtimePayData() throws Exception {
        Pageable pageable = PageableUtil.getPageableDesc("channelName", 0, 1000);
        String ds = DateUtil.getDateStrBeforeToday(0).substring(0, 10);
        return realtimePayRepository.findByDs(ds, pageable);
    }

    private Map<String, List<String>> getCateMap(List<AdsOfflinePayModel> data) throws Exception {
        Map<String, List<String>> cateMap = new TreeMap<>();
        for (AdsOfflinePayModel d : data) {
            List<String> cateList = new ArrayList<>();
            cateList.add(d.getCateLevel1Name());
            cateList.add(d.getCateLevel2Name());
            cateMap.put(d.getItemName(), cateList);
        }
        return cateMap;
    }

    public List<PayModel> getData() throws Exception {
        List<PayModel> payData = new ArrayList<>();
        List<AdsOfflinePayModel> offlineData = getAdsOfflinePayData();
        List<RealtimePayModel> realtimeData = getRealtimePayData();
        // 关联出历史记录中的商品和类目关系, 便于之后通过商品名称反查类目
        Map<String, List<String>> cateMap = getCateMap(offlineData);

        for (AdsOfflinePayModel o : offlineData) {
            PayModel pay = new PayModel(
                    o.getChannelName(),
                    o.getCateLevel1Name(),
                    o.getCateLevel2Name(),
                    o.getItemName(),
                    o.getOrdCnt(),
                    BigDecimal.valueOf(o.getAmtCnt())
            );
            payData.add(pay);
        }

        // 遍历实时列表, 反查商品名称对应类目
        for (RealtimePayModel r : realtimeData) {
            List<String> cate = cateMap.get(r.getItemName());
            if (cate != null) {
                r.setCateLevel1Name(cate.get(0));
                r.setCateLevel2Name(cate.get(1));
            }
        }

        for (RealtimePayModel r : realtimeData) {
            // 判断实时的商品名称是否出现在历史离线名称中
            boolean inOffline = false;
            // 如果存在, 则将订单数和金额累加
            for (PayModel p : payData) {
                if (p.getChannelName().equals(r.getChannelName()) && p.getItemName().equals(r.getItemName())) {
                    p.setOrdCnt(p.getOrdCnt() + r.getOrdCnt());
                    p.setAmtCnt(p.getAmtCnt().add(r.getAmtCnt()));
                    inOffline = true;
                }
            }
            // 如果不存在, 则新增名称, 但该名称肯定没有类目信息
            if (!inOffline) {
                payData.add(new PayModel(
                        r.getChannelName(),
                        r.getCateLevel1Name(),
                        r.getCateLevel2Name(),
                        r.getItemName(),
                        r.getOrdCnt(),
                        r.getAmtCnt()
                ));
            }
        }

        // for (PayModel p : payData) {
        //     System.out.println(p.toString());
        // }

        // System.out.println(offlineData.size());
        // System.out.println(realtimeData.size());
        // System.out.println(payData.size());

        long totalCnt = 0;
        BigDecimal totalAmt = BigDecimal.valueOf(0);
        for (PayModel p : payData) {
            totalCnt += p.getOrdCnt();
            totalAmt = totalAmt.add(p.getAmtCnt());
        }
        payData.add(new PayModel(
                "合计",
                "",
                "",
                "",
                totalCnt,
                totalAmt
        ));

        return payData;
    }

    public void test() {

    }
}
