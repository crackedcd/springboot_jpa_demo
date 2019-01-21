package com.mm.itempvuv.jpa.ads.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class AdsOfflinePayModel implements Serializable {

    private String channelName;
    private String cateLevel1Name;
    private String cateLevel2Name;
    private String itemName;
    private Long ordCnt;
    private Double amtCnt;

    public AdsOfflinePayModel(String channelName, String cateLevel1Name, String cateLevel2Name, String itemName, Long ordCnt, Double amtCnt) {
        this.channelName = channelName;
        this.cateLevel1Name = cateLevel1Name;
        this.cateLevel2Name = cateLevel2Name;
        this.itemName = itemName;
        this.ordCnt = ordCnt;
        this.amtCnt = amtCnt;
    }
}
