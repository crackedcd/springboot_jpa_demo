package com.mm.itempvuv.jpa.qbi.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AdsYymhRealPayAmtTopTdEntityPK implements Serializable {
    private long channelId;
    private long itemId;
    private String ds;

    @Column(name = "channel_id")
    @Id
    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    @Column(name = "item_id")
    @Id
    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Column(name = "ds")
    @Id
    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdsYymhRealPayAmtTopTdEntityPK that = (AdsYymhRealPayAmtTopTdEntityPK) o;
        return channelId == that.channelId &&
                itemId == that.itemId &&
                Objects.equals(ds, that.ds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, itemId, ds);
    }
}
