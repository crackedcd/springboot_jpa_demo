package com.mm.itempvuv.service;

import com.mm.itempvuv.common.util.DateUtil;
import com.mm.itempvuv.jpa.entity.AdsYymhRealItemPvUvTdEntity;
import com.mm.itempvuv.jpa.repository.PvUvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PvUvService {

    @Autowired
    private PvUvRepository pvUvRepository;

    public String test(String ds) {
        StringBuilder str = new StringBuilder("<table border=\"1\"><th>序号</th><th>渠道</th><th>商品名称</th><th>pv</th><th>uv</th>");
        int countNum = 1;
        int scPv = 0;
        int scUv = 0;
        int ysPv = 0;
        int ysUv = 0;
        int totalPv = 0;
        int totalUv = 0;
        Pageable pageable = getPageableDesc("itemPvTd", 0, 1000);
        if (ds.equals("nothing")) {
            ds = DateUtil.getDateStrBeforeToday(0);
        }
        List<AdsYymhRealItemPvUvTdEntity> pvUvList = pvUvRepository.findByDs(ds, pageable);
        for (AdsYymhRealItemPvUvTdEntity pvUv : pvUvList) {
            str.append(String.format("<tr><td>%d</td><td>%s</td><td>%s</td><td>%d</td><td>%d</td></tr>",
                    countNum, pvUv.getChannelName(), pvUv.getItemName(), pvUv.getItemPvTd(), pvUv.getItemUvTd()));
            countNum++;
            if (pvUv.getChannelId() == 1) {
                scPv += pvUv.getItemPvTd();
                scUv += pvUv.getItemUvTd();
            } else if (pvUv.getChannelId() == 2) {
                ysPv += pvUv.getItemPvTd();
                ysUv += pvUv.getItemUvTd();
            }
            totalPv += pvUv.getItemPvTd();
            totalUv += pvUv.getItemUvTd();
        }
        str.append(String.format("<tr><td></td><td>茅台商城</td><td>合计</td><td>%d</td><td>%d</td></tr>",
                scPv, scUv));
        str.append(String.format("<tr><td></td><td>云商平台</td><td>合计</td><td>%d</td><td>%d</td></tr>",
                ysPv, ysUv));
        str.append(String.format("<tr><td></td><td></td><td>合计</td><td>%d</td><td>%d</td></tr>",
                totalPv, totalUv));
        str.append("</table>");
        return str.toString();
    }

    private Pageable getPageableAsc(String col, int page, int pageSize) {
        return PageRequest.of(page, pageSize, new Sort(Sort.Direction.ASC, col));
    }

    private Pageable getPageableDesc(String col, int page, int pageSize) {
        return PageRequest.of(page, pageSize, new Sort(Sort.Direction.DESC, col));
    }
}
