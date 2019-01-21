package com.mm.itempvuv.jpa.qbi.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Data
@ToString
public class OfflinePayModel implements Serializable {

    private String channelName;
    private String cateLevel1Name;
    private String cateLevel2Name;
    private String itemName;
    private Long ordCnt;
    private Double amtCnt;

    public OfflinePayModel(String channelName, String cateLevel1Name, String cateLevel2Name, String itemName, Long ordCnt, Double amtCnt) {
        this.channelName = channelName;
        this.cateLevel1Name = cateLevel1Name;
        this.cateLevel2Name = cateLevel2Name;
        this.itemName = itemName;
        this.ordCnt = ordCnt;
        this.amtCnt = amtCnt;
    }
}
