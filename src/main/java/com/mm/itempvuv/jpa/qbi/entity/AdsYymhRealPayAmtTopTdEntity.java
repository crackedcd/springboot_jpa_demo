package com.mm.itempvuv.jpa.qbi.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ads_yymh_real_pay_amt_top_td", schema = "quickbi-odps", catalog = "")
@IdClass(AdsYymhRealPayAmtTopTdEntityPK.class)
public class AdsYymhRealPayAmtTopTdEntity {
    private long channelId;
    private String channelName;
    private long itemId;
    private String itemName;
    private BigDecimal payAmtTd;
    private Long payOrdTd;
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
    @Column(name = "pay_amt_td")
    public BigDecimal getPayAmtTd() {
        return payAmtTd;
    }

    public void setPayAmtTd(BigDecimal payAmtTd) {
        this.payAmtTd = payAmtTd;
    }

    @Basic
    @Column(name = "pay_ord_td")
    public Long getPayOrdTd() {
        return payOrdTd;
    }

    public void setPayOrdTd(Long payOrdTd) {
        this.payOrdTd = payOrdTd;
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
        AdsYymhRealPayAmtTopTdEntity that = (AdsYymhRealPayAmtTopTdEntity) o;
        return channelId == that.channelId &&
                itemId == that.itemId &&
                Objects.equals(channelName, that.channelName) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(payAmtTd, that.payAmtTd) &&
                Objects.equals(payOrdTd, that.payOrdTd) &&
                Objects.equals(ds, that.ds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, channelName, itemId, itemName, payAmtTd, payOrdTd, ds);
    }
}
