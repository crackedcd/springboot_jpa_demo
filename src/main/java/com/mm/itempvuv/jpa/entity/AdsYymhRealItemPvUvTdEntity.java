package com.mm.itempvuv.jpa.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ads_yymh_real_item_pv_uv_td", schema = "quickbi-odps", catalog = "")
@IdClass(AdsYymhRealItemPvUvTdEntityPK.class)
public class AdsYymhRealItemPvUvTdEntity {
    private long channelId;
    private String channelName;
    private long itemId;
    private String itemName;
    private Long itemPvTd;
    private Long itemUvTd;
    private String ds;

    @Id
    @Column(name = "channel_id")
    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "channel_name")
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Id
    @Column(name = "item_id")
    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_name")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_pv_td")
    public Long getItemPvTd() {
        return itemPvTd;
    }

    public void setItemPvTd(Long itemPvTd) {
        this.itemPvTd = itemPvTd;
    }

    @Basic
    @Column(name = "item_uv_td")
    public Long getItemUvTd() {
        return itemUvTd;
    }

    public void setItemUvTd(Long itemUvTd) {
        this.itemUvTd = itemUvTd;
    }

    @Id
    @Column(name = "ds")
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
        AdsYymhRealItemPvUvTdEntity that = (AdsYymhRealItemPvUvTdEntity) o;
        return channelId == that.channelId &&
                itemId == that.itemId &&
                Objects.equals(channelName, that.channelName) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemPvTd, that.itemPvTd) &&
                Objects.equals(itemUvTd, that.itemUvTd) &&
                Objects.equals(ds, that.ds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, channelName, itemId, itemName, itemPvTd, itemUvTd, ds);
    }
}
