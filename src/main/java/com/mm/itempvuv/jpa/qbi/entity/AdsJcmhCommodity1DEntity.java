package com.mm.itempvuv.jpa.qbi.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ads_jcmh_commodity_1d", schema = "quickbi-odps", catalog = "")
public class AdsJcmhCommodity1DEntity {
    private String channelId;
    private String channelName;
    private Long cateLevel2Id;
    private String cateLevel2Name;
    private Long itemId;
    private String itemName;
    private Double payOrdAmt1D;
    private Double payOrdTon1D;
    private Long payOrdBottle1D;
    private Long content;
    private Date ds;
    private Long itmAvailableCounter;
    private Long cateLevel1Id;
    private String cateLevel1Name;
    private Double itmTurnoverPer1D;
    private Long payOrdCnt1D;
    private Long itmUvCnt1D;
    private Long itmPvCnt1D;
    private Long virStockCnt1D;

    @Id
    @Basic
    @Column(name = "channel_id")
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
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

    @Basic
    @Column(name = "cate_level2_id")
    public Long getCateLevel2Id() {
        return cateLevel2Id;
    }

    public void setCateLevel2Id(Long cateLevel2Id) {
        this.cateLevel2Id = cateLevel2Id;
    }

    @Basic
    @Column(name = "cate_level2_name")
    public String getCateLevel2Name() {
        return cateLevel2Name;
    }

    public void setCateLevel2Name(String cateLevel2Name) {
        this.cateLevel2Name = cateLevel2Name;
    }

    @Basic
    @Column(name = "item_id")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
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
    @Column(name = "pay_ord_amt_1d")
    public Double getPayOrdAmt1D() {
        return payOrdAmt1D;
    }

    public void setPayOrdAmt1D(Double payOrdAmt1D) {
        this.payOrdAmt1D = payOrdAmt1D;
    }

    @Basic
    @Column(name = "pay_ord_ton_1d")
    public Double getPayOrdTon1D() {
        return payOrdTon1D;
    }

    public void setPayOrdTon1D(Double payOrdTon1D) {
        this.payOrdTon1D = payOrdTon1D;
    }

    @Basic
    @Column(name = "pay_ord_bottle_1d")
    public Long getPayOrdBottle1D() {
        return payOrdBottle1D;
    }

    public void setPayOrdBottle1D(Long payOrdBottle1D) {
        this.payOrdBottle1D = payOrdBottle1D;
    }

    @Basic
    @Column(name = "content")
    public Long getContent() {
        return content;
    }

    public void setContent(Long content) {
        this.content = content;
    }

    @Basic
    @Column(name = "ds")
    public Date getDs() {
        return ds;
    }

    public void setDs(Date ds) {
        this.ds = ds;
    }

    @Basic
    @Column(name = "itm_available_counter")
    public Long getItmAvailableCounter() {
        return itmAvailableCounter;
    }

    public void setItmAvailableCounter(Long itmAvailableCounter) {
        this.itmAvailableCounter = itmAvailableCounter;
    }

    @Basic
    @Column(name = "cate_level1_id")
    public Long getCateLevel1Id() {
        return cateLevel1Id;
    }

    public void setCateLevel1Id(Long cateLevel1Id) {
        this.cateLevel1Id = cateLevel1Id;
    }

    @Basic
    @Column(name = "cate_level1_name")
    public String getCateLevel1Name() {
        return cateLevel1Name;
    }

    public void setCateLevel1Name(String cateLevel1Name) {
        this.cateLevel1Name = cateLevel1Name;
    }

    @Basic
    @Column(name = "itm_turnover_per_1d")
    public Double getItmTurnoverPer1D() {
        return itmTurnoverPer1D;
    }

    public void setItmTurnoverPer1D(Double itmTurnoverPer1D) {
        this.itmTurnoverPer1D = itmTurnoverPer1D;
    }

    @Basic
    @Column(name = "pay_ord_cnt_1d")
    public Long getPayOrdCnt1D() {
        return payOrdCnt1D;
    }

    public void setPayOrdCnt1D(Long payOrdCnt1D) {
        this.payOrdCnt1D = payOrdCnt1D;
    }

    @Basic
    @Column(name = "itm_uv_cnt_1d")
    public Long getItmUvCnt1D() {
        return itmUvCnt1D;
    }

    public void setItmUvCnt1D(Long itmUvCnt1D) {
        this.itmUvCnt1D = itmUvCnt1D;
    }

    @Basic
    @Column(name = "itm_pv_cnt_1d")
    public Long getItmPvCnt1D() {
        return itmPvCnt1D;
    }

    public void setItmPvCnt1D(Long itmPvCnt1D) {
        this.itmPvCnt1D = itmPvCnt1D;
    }

    @Basic
    @Column(name = "vir_stock_cnt_1d")
    public Long getVirStockCnt1D() {
        return virStockCnt1D;
    }

    public void setVirStockCnt1D(Long virStockCnt1D) {
        this.virStockCnt1D = virStockCnt1D;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdsJcmhCommodity1DEntity that = (AdsJcmhCommodity1DEntity) o;
        return Objects.equals(channelId, that.channelId) &&
                Objects.equals(channelName, that.channelName) &&
                Objects.equals(cateLevel2Id, that.cateLevel2Id) &&
                Objects.equals(cateLevel2Name, that.cateLevel2Name) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(payOrdAmt1D, that.payOrdAmt1D) &&
                Objects.equals(payOrdTon1D, that.payOrdTon1D) &&
                Objects.equals(payOrdBottle1D, that.payOrdBottle1D) &&
                Objects.equals(content, that.content) &&
                Objects.equals(ds, that.ds) &&
                Objects.equals(itmAvailableCounter, that.itmAvailableCounter) &&
                Objects.equals(cateLevel1Id, that.cateLevel1Id) &&
                Objects.equals(cateLevel1Name, that.cateLevel1Name) &&
                Objects.equals(itmTurnoverPer1D, that.itmTurnoverPer1D) &&
                Objects.equals(payOrdCnt1D, that.payOrdCnt1D) &&
                Objects.equals(itmUvCnt1D, that.itmUvCnt1D) &&
                Objects.equals(itmPvCnt1D, that.itmPvCnt1D) &&
                Objects.equals(virStockCnt1D, that.virStockCnt1D);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, channelName, cateLevel2Id, cateLevel2Name, itemId, itemName, payOrdAmt1D, payOrdTon1D, payOrdBottle1D, content, ds, itmAvailableCounter, cateLevel1Id, cateLevel1Name, itmTurnoverPer1D, payOrdCnt1D, itmUvCnt1D, itmPvCnt1D, virStockCnt1D);
    }
}
