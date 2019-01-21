package com.mm.itempvuv.jpa.qbi.repository;

import com.mm.itempvuv.jpa.qbi.entity.AdsYymhRealItemPvUvTdEntity;
import com.mm.itempvuv.jpa.qbi.entity.AdsYymhRealItemPvUvTdEntityPK;
import com.mm.itempvuv.jpa.qbi.model.PvUvModel;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PvUvRepository extends JpaRepository<AdsYymhRealItemPvUvTdEntity, AdsYymhRealItemPvUvTdEntityPK> {

    public List<AdsYymhRealItemPvUvTdEntity> findByDs(String ds, Pageable pageable);

    @Query(value = "select new com.mm.itempvuv.jpa.qbi.model.PvUvModel(t.channelName, t.itemName, t.itemPvTd, t.itemUvTd, t.ds) " +
            " from AdsYymhRealItemPvUvTdEntity t where t.ds = :ds")
    public List<PvUvModel> searchByDs(@Param("ds") String ds, Pageable pageable);

}
