package com.mm.itempvuv.jpa.qbi.repository;

import com.mm.itempvuv.jpa.qbi.entity.AdsYymhRealPayAmtTopTdEntity;
import com.mm.itempvuv.jpa.qbi.entity.AdsYymhRealPayAmtTopTdEntityPK;
import com.mm.itempvuv.jpa.qbi.model.RealtimePayModel;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RealtimePayRepository extends JpaRepository<AdsYymhRealPayAmtTopTdEntity, AdsYymhRealPayAmtTopTdEntityPK> {

    @Query(value = "select new com.mm.itempvuv.jpa.qbi.model.RealtimePayModel" +
            "(t.channelName, '', '', t.itemName, t.payOrdTd, t.payAmtTd) " +
            " from AdsYymhRealPayAmtTopTdEntity t where t.ds = :ds")
    public List<RealtimePayModel> findByDs(@Param("ds") String ds, Pageable pageable);

}
