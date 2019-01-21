package com.mm.itempvuv.jpa.ads.repository;

import com.mm.itempvuv.jpa.ads.entity.DwdMtOrdAllDiEntity;
import com.mm.itempvuv.jpa.ads.model.AdsOfflinePayModel;
import com.mm.itempvuv.jpa.qbi.entity.AdsJcmhCommodity1DEntity;
import com.mm.itempvuv.jpa.qbi.model.OfflinePayModel;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AdsOfflinePayRepository extends JpaRepository<DwdMtOrdAllDiEntity, String> {

    @Query(value = "select new com.mm.itempvuv.jpa.ads.model.AdsOfflinePayModel" +
            "(t.channelName, t.cateLevel1Name, t.cateLevel2Name, t.itemName, count(distinct t.orderNo), sum(t.payAmt)) " +
            " from DwdMtOrdAllDiEntity t where t.newOrderTime >= :t1 and t.newOrderTime < :t2 " +
            " and t.newStatus in ('已付款', '已客审', '发货中', '已收货', '完成', '已财审', '已发货') " +
            " and t.sellerId = 520100258 and t.newPayTime is not null " +
            " group by t.channelName, t.cateLevel1Name, t.cateLevel2Name, t.itemName")
    public List<AdsOfflinePayModel> findByDs(@Param("t1") String t1, @Param("t2") String t2, Pageable pageable);

}
