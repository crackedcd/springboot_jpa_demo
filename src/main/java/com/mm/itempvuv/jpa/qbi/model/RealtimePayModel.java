package com.mm.itempvuv.jpa.qbi.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ToString
public class RealtimePayModel implements Serializable {

    private String channelName;
    private String cateLevel1Name;
    private String cateLevel2Name;
    private String itemName;
    private Long ordCnt;
    private BigDecimal amtCnt;

    public RealtimePayModel(String channelName, String cateLevel1Name, String cateLevel2Name, String itemName, Long ordCnt, BigDecimal amtCnt) {
        this.channelName = channelName;
        this.cateLevel1Name = cateLevel1Name;
        this.cateLevel2Name = cateLevel2Name;
        this.itemName = itemName;
        this.ordCnt = ordCnt;
        this.amtCnt = amtCnt;
    }
}
