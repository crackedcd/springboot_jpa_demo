package com.mm.itempvuv.jpa.qbi.repository;

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
public interface OfflinePayRepository extends JpaRepository<AdsJcmhCommodity1DEntity, String> {

    @Query(value = "select new com.mm.itempvuv.jpa.qbi.model.OfflinePayModel" +
            "(t.channelName, t.cateLevel1Name, t.cateLevel2Name, t.itemName, sum(t.payOrdCnt1D), sum(t.payOrdAmt1D)) " +
            " from AdsJcmhCommodity1DEntity t where t.ds >= :ds1 and t.ds <= :ds2 and t.content = 1 " +
            " group by t.channelName, t.cateLevel1Name, t.cateLevel2Name, t.itemName")
    public List<OfflinePayModel> findByDs(@Param("ds1") Date ds1, @Param("ds2") Date ds2, Pageable pageable);

}
