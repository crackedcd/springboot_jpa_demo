package com.mm.itempvuv.jpa.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class PvUvModel implements Serializable {

    private String channelName;
    private String itemName;
    private Long itemPvTd;
    private Long itemUvTd;
    private String ds;

    public PvUvModel(String channelName, String itemName, Long itemPvTd, Long itemUvTd, String ds) {
        this.channelName = channelName;
        this.itemName = itemName;
        this.itemPvTd = itemPvTd;
        this.itemUvTd = itemUvTd;
        this.ds = ds;
    }
}
