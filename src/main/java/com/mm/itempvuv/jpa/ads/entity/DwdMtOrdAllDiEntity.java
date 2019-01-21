package com.mm.itempvuv.jpa.ads.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dwd_mt_ord_all_di", schema = "", catalog = "bigv_ads")
public class DwdMtOrdAllDiEntity {
    private Double actualSubtotalAmount;
    private String address;
    private String addressId;
    private Long brandId;
    private String brandName;
    private Long cateId;
    private String cateLevel;
    private Long cateLevel1Id;
    private String cateLevel1Name;
    private Long cateLevel2Id;
    private String cateLevel2Name;
    private Long cateLevel3Id;
    private String cateLevel3Name;
    private Long cateLevel4Id;
    private String cateLevel4Name;
    private Long cateLevel5Id;
    private String cateLevel5Name;
    private String cateName;
    private Long channelId;
    private String channelName;
    private Long clientSourceType;
    private String deliveryAreaCode;
    private String deliveryAreaName;
    private String deliveryCityCode;
    private String deliveryCityName;
    private Long deliveryId;
    private String deliveryMobile;
    private String deliveryName;
    private String deliveryPhone;
    private String deliveryProvinceCode;
    private String deliveryProvinceName;
    private String deliveryStreetCode;
    private String deliveryStreetName;
    private Long deliveryType;
    private Double divActivityDiscountAmt;
    private Double divCommissionAmt;
    private Double divCouponAmt;
    private Double divFreightAmt;
    private Double divGiftTotalAmt;
    private Double divLogisticsCost;
    private Double divPlatformDiscountAmt;
    private Double divPointDiscountAmt;
    private Double divShopDiscountAmt;
    private Long gender;
    private String invoiceNo;
    private String invoiceTitle;
    private Long invoiceTitleType;
    private Long invoiceType;
    private Long isFetch;
    private Long isQrBuy;
    private Double itemAmt;
    private String itemCode;
    private Double itemDiscountedPrice;
    private Long itemId;
    private String itemName;
    private Long itemNum;
    private Double itemPrice;
    private String itemType;
    private Long level;
    private Long levelId;
    private String levelName;
    private Long logisticsBear;
    private String logisticsCompany;
    private String memberAreaCode;
    private String memberAreaName;
    private String memberCityCode;
    private String memberCityName;
    private Long memberId;
    private String memberProvinceCode;
    private String memberProvinceName;
    private String memberStreetCode;
    private String memberStreetName;
    private String memberUsername;
    private Long needFinanceAudit;
    private Long needVisitAudit;
    private String newOrderTime;
    private String newPayTime;
    private String newStatus;
    private Long offlinePayMethod;
    private Long operateType;
    private String orderId;
    private String orderKey;
    private String orderNo;
    private String orderStatus;
    private String orderTime;
    private String orgaName;
    private Double payAmt;
    private String payMethod;
    private String payTime;
    private Double platformDiscountPrice;
    private Long productId;
    private String productName;
    private Long qrBuyId;
    private String returnStatus;
    private String sellerCityCode;
    private String sellerCityName;
    private String sellerCountyCode;
    private String sellerCountyName;
    private Long sellerId;
    private String sellerName;
    private String sellerProvinceCode;
    private String sellerProvinceName;
    private String sellerStreetCode;
    private String sellerStreetName;
    private String sellerType;
    private String shopCityCode;
    private String shopCityName;
    private String shopCountyCode;
    private String shopCountyName;
    private Double shopDiscountPrice;
    private Long shopId;
    private String shopName;
    private String shopProvinceCode;
    private String shopProvinceName;
    private String shopStreetCode;
    private String shopStreetName;
    private String shopType;
    private String skuDesc;
    private Long skuId;
    private String skuProps;
    private String sourceChannel;
    private String sourceOrderNo;
    private String sourceShopNo;
    private Double subtotalAmount;
    private String taxCode;
    private Long tenantId;
    private Long transactionType;

    @Basic
    @Column(name = "actual_subtotal_amount")
    public Double getActualSubtotalAmount() {
        return actualSubtotalAmount;
    }

    public void setActualSubtotalAmount(Double actualSubtotalAmount) {
        this.actualSubtotalAmount = actualSubtotalAmount;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "address_id")
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "brand_id")
    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "brand_name")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "cate_id")
    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    @Basic
    @Column(name = "cate_level")
    public String getCateLevel() {
        return cateLevel;
    }

    public void setCateLevel(String cateLevel) {
        this.cateLevel = cateLevel;
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
    @Column(name = "cate_level3_id")
    public Long getCateLevel3Id() {
        return cateLevel3Id;
    }

    public void setCateLevel3Id(Long cateLevel3Id) {
        this.cateLevel3Id = cateLevel3Id;
    }

    @Basic
    @Column(name = "cate_level3_name")
    public String getCateLevel3Name() {
        return cateLevel3Name;
    }

    public void setCateLevel3Name(String cateLevel3Name) {
        this.cateLevel3Name = cateLevel3Name;
    }

    @Basic
    @Column(name = "cate_level4_id")
    public Long getCateLevel4Id() {
        return cateLevel4Id;
    }

    public void setCateLevel4Id(Long cateLevel4Id) {
        this.cateLevel4Id = cateLevel4Id;
    }

    @Basic
    @Column(name = "cate_level4_name")
    public String getCateLevel4Name() {
        return cateLevel4Name;
    }

    public void setCateLevel4Name(String cateLevel4Name) {
        this.cateLevel4Name = cateLevel4Name;
    }

    @Basic
    @Column(name = "cate_level5_id")
    public Long getCateLevel5Id() {
        return cateLevel5Id;
    }

    public void setCateLevel5Id(Long cateLevel5Id) {
        this.cateLevel5Id = cateLevel5Id;
    }

    @Basic
    @Column(name = "cate_level5_name")
    public String getCateLevel5Name() {
        return cateLevel5Name;
    }

    public void setCateLevel5Name(String cateLevel5Name) {
        this.cateLevel5Name = cateLevel5Name;
    }

    @Basic
    @Column(name = "cate_name")
    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Basic
    @Column(name = "channel_id")
    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
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
    @Column(name = "client_source_type")
    public Long getClientSourceType() {
        return clientSourceType;
    }

    public void setClientSourceType(Long clientSourceType) {
        this.clientSourceType = clientSourceType;
    }

    @Basic
    @Column(name = "delivery_area_code")
    public String getDeliveryAreaCode() {
        return deliveryAreaCode;
    }

    public void setDeliveryAreaCode(String deliveryAreaCode) {
        this.deliveryAreaCode = deliveryAreaCode;
    }

    @Basic
    @Column(name = "delivery_area_name")
    public String getDeliveryAreaName() {
        return deliveryAreaName;
    }

    public void setDeliveryAreaName(String deliveryAreaName) {
        this.deliveryAreaName = deliveryAreaName;
    }

    @Basic
    @Column(name = "delivery_city_code")
    public String getDeliveryCityCode() {
        return deliveryCityCode;
    }

    public void setDeliveryCityCode(String deliveryCityCode) {
        this.deliveryCityCode = deliveryCityCode;
    }

    @Basic
    @Column(name = "delivery_city_name")
    public String getDeliveryCityName() {
        return deliveryCityName;
    }

    public void setDeliveryCityName(String deliveryCityName) {
        this.deliveryCityName = deliveryCityName;
    }

    @Basic
    @Column(name = "delivery_id")
    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Basic
    @Column(name = "delivery_mobile")
    public String getDeliveryMobile() {
        return deliveryMobile;
    }

    public void setDeliveryMobile(String deliveryMobile) {
        this.deliveryMobile = deliveryMobile;
    }

    @Basic
    @Column(name = "delivery_name")
    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    @Basic
    @Column(name = "delivery_phone")
    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    @Basic
    @Column(name = "delivery_province_code")
    public String getDeliveryProvinceCode() {
        return deliveryProvinceCode;
    }

    public void setDeliveryProvinceCode(String deliveryProvinceCode) {
        this.deliveryProvinceCode = deliveryProvinceCode;
    }

    @Basic
    @Column(name = "delivery_province_name")
    public String getDeliveryProvinceName() {
        return deliveryProvinceName;
    }

    public void setDeliveryProvinceName(String deliveryProvinceName) {
        this.deliveryProvinceName = deliveryProvinceName;
    }

    @Basic
    @Column(name = "delivery_street_code")
    public String getDeliveryStreetCode() {
        return deliveryStreetCode;
    }

    public void setDeliveryStreetCode(String deliveryStreetCode) {
        this.deliveryStreetCode = deliveryStreetCode;
    }

    @Basic
    @Column(name = "delivery_street_name")
    public String getDeliveryStreetName() {
        return deliveryStreetName;
    }

    public void setDeliveryStreetName(String deliveryStreetName) {
        this.deliveryStreetName = deliveryStreetName;
    }

    @Basic
    @Column(name = "delivery_type")
    public Long getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Basic
    @Column(name = "div_activity_discount_amt")
    public Double getDivActivityDiscountAmt() {
        return divActivityDiscountAmt;
    }

    public void setDivActivityDiscountAmt(Double divActivityDiscountAmt) {
        this.divActivityDiscountAmt = divActivityDiscountAmt;
    }

    @Basic
    @Column(name = "div_commission_amt")
    public Double getDivCommissionAmt() {
        return divCommissionAmt;
    }

    public void setDivCommissionAmt(Double divCommissionAmt) {
        this.divCommissionAmt = divCommissionAmt;
    }

    @Basic
    @Column(name = "div_coupon_amt")
    public Double getDivCouponAmt() {
        return divCouponAmt;
    }

    public void setDivCouponAmt(Double divCouponAmt) {
        this.divCouponAmt = divCouponAmt;
    }

    @Basic
    @Column(name = "div_freight_amt")
    public Double getDivFreightAmt() {
        return divFreightAmt;
    }

    public void setDivFreightAmt(Double divFreightAmt) {
        this.divFreightAmt = divFreightAmt;
    }

    @Basic
    @Column(name = "div_gift_total_amt")
    public Double getDivGiftTotalAmt() {
        return divGiftTotalAmt;
    }

    public void setDivGiftTotalAmt(Double divGiftTotalAmt) {
        this.divGiftTotalAmt = divGiftTotalAmt;
    }

    @Basic
    @Column(name = "div_logistics_cost")
    public Double getDivLogisticsCost() {
        return divLogisticsCost;
    }

    public void setDivLogisticsCost(Double divLogisticsCost) {
        this.divLogisticsCost = divLogisticsCost;
    }

    @Basic
    @Column(name = "div_platform_discount_amt")
    public Double getDivPlatformDiscountAmt() {
        return divPlatformDiscountAmt;
    }

    public void setDivPlatformDiscountAmt(Double divPlatformDiscountAmt) {
        this.divPlatformDiscountAmt = divPlatformDiscountAmt;
    }

    @Basic
    @Column(name = "div_point_discount_amt")
    public Double getDivPointDiscountAmt() {
        return divPointDiscountAmt;
    }

    public void setDivPointDiscountAmt(Double divPointDiscountAmt) {
        this.divPointDiscountAmt = divPointDiscountAmt;
    }

    @Basic
    @Column(name = "div_shop_discount_amt")
    public Double getDivShopDiscountAmt() {
        return divShopDiscountAmt;
    }

    public void setDivShopDiscountAmt(Double divShopDiscountAmt) {
        this.divShopDiscountAmt = divShopDiscountAmt;
    }

    @Basic
    @Column(name = "gender")
    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "invoice_no")
    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Basic
    @Column(name = "invoice_title")
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    @Basic
    @Column(name = "invoice_title_type")
    public Long getInvoiceTitleType() {
        return invoiceTitleType;
    }

    public void setInvoiceTitleType(Long invoiceTitleType) {
        this.invoiceTitleType = invoiceTitleType;
    }

    @Basic
    @Column(name = "invoice_type")
    public Long getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Long invoiceType) {
        this.invoiceType = invoiceType;
    }

    @Basic
    @Column(name = "is_fetch")
    public Long getIsFetch() {
        return isFetch;
    }

    public void setIsFetch(Long isFetch) {
        this.isFetch = isFetch;
    }

    @Basic
    @Column(name = "is_qr_buy")
    public Long getIsQrBuy() {
        return isQrBuy;
    }

    public void setIsQrBuy(Long isQrBuy) {
        this.isQrBuy = isQrBuy;
    }

    @Basic
    @Column(name = "item_amt")
    public Double getItemAmt() {
        return itemAmt;
    }

    public void setItemAmt(Double itemAmt) {
        this.itemAmt = itemAmt;
    }

    @Basic
    @Column(name = "item_code")
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Basic
    @Column(name = "item_discounted_price")
    public Double getItemDiscountedPrice() {
        return itemDiscountedPrice;
    }

    public void setItemDiscountedPrice(Double itemDiscountedPrice) {
        this.itemDiscountedPrice = itemDiscountedPrice;
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
    @Column(name = "item_num")
    public Long getItemNum() {
        return itemNum;
    }

    public void setItemNum(Long itemNum) {
        this.itemNum = itemNum;
    }

    @Basic
    @Column(name = "item_price")
    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Basic
    @Column(name = "item_type")
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "level")
    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    @Basic
    @Column(name = "level_id")
    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    @Basic
    @Column(name = "level_name")
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Basic
    @Column(name = "logistics_bear")
    public Long getLogisticsBear() {
        return logisticsBear;
    }

    public void setLogisticsBear(Long logisticsBear) {
        this.logisticsBear = logisticsBear;
    }

    @Basic
    @Column(name = "logistics_company")
    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    @Basic
    @Column(name = "member_area_code")
    public String getMemberAreaCode() {
        return memberAreaCode;
    }

    public void setMemberAreaCode(String memberAreaCode) {
        this.memberAreaCode = memberAreaCode;
    }

    @Basic
    @Column(name = "member_area_name")
    public String getMemberAreaName() {
        return memberAreaName;
    }

    public void setMemberAreaName(String memberAreaName) {
        this.memberAreaName = memberAreaName;
    }

    @Basic
    @Column(name = "member_city_code")
    public String getMemberCityCode() {
        return memberCityCode;
    }

    public void setMemberCityCode(String memberCityCode) {
        this.memberCityCode = memberCityCode;
    }

    @Basic
    @Column(name = "member_city_name")
    public String getMemberCityName() {
        return memberCityName;
    }

    public void setMemberCityName(String memberCityName) {
        this.memberCityName = memberCityName;
    }

    @Basic
    @Column(name = "member_id")
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "member_province_code")
    public String getMemberProvinceCode() {
        return memberProvinceCode;
    }

    public void setMemberProvinceCode(String memberProvinceCode) {
        this.memberProvinceCode = memberProvinceCode;
    }

    @Basic
    @Column(name = "member_province_name")
    public String getMemberProvinceName() {
        return memberProvinceName;
    }

    public void setMemberProvinceName(String memberProvinceName) {
        this.memberProvinceName = memberProvinceName;
    }

    @Basic
    @Column(name = "member_street_code")
    public String getMemberStreetCode() {
        return memberStreetCode;
    }

    public void setMemberStreetCode(String memberStreetCode) {
        this.memberStreetCode = memberStreetCode;
    }

    @Basic
    @Column(name = "member_street_name")
    public String getMemberStreetName() {
        return memberStreetName;
    }

    public void setMemberStreetName(String memberStreetName) {
        this.memberStreetName = memberStreetName;
    }

    @Basic
    @Column(name = "member_username")
    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Basic
    @Column(name = "need_finance_audit")
    public Long getNeedFinanceAudit() {
        return needFinanceAudit;
    }

    public void setNeedFinanceAudit(Long needFinanceAudit) {
        this.needFinanceAudit = needFinanceAudit;
    }

    @Basic
    @Column(name = "need_visit_audit")
    public Long getNeedVisitAudit() {
        return needVisitAudit;
    }

    public void setNeedVisitAudit(Long needVisitAudit) {
        this.needVisitAudit = needVisitAudit;
    }

    @Basic
    @Column(name = "new_order_time")
    public String getNewOrderTime() {
        return newOrderTime;
    }

    public void setNewOrderTime(String newOrderTime) {
        this.newOrderTime = newOrderTime;
    }

    @Basic
    @Column(name = "new_pay_time")
    public String getNewPayTime() {
        return newPayTime;
    }

    public void setNewPayTime(String newPayTime) {
        this.newPayTime = newPayTime;
    }

    @Basic
    @Column(name = "new_status")
    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    @Basic
    @Column(name = "offline_pay_method")
    public Long getOfflinePayMethod() {
        return offlinePayMethod;
    }

    public void setOfflinePayMethod(Long offlinePayMethod) {
        this.offlinePayMethod = offlinePayMethod;
    }

    @Basic
    @Column(name = "operate_type")
    public Long getOperateType() {
        return operateType;
    }

    public void setOperateType(Long operateType) {
        this.operateType = operateType;
    }

    @Id
    @Basic
    @Column(name = "order_id")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_key")
    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    @Basic
    @Column(name = "order_no")
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "order_status")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "order_time")
    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "orga_name")
    public String getOrgaName() {
        return orgaName;
    }

    public void setOrgaName(String orgaName) {
        this.orgaName = orgaName;
    }

    @Basic
    @Column(name = "pay_amt")
    public Double getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(Double payAmt) {
        this.payAmt = payAmt;
    }

    @Basic
    @Column(name = "pay_method")
    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    @Basic
    @Column(name = "pay_time")
    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "platform_discount_price")
    public Double getPlatformDiscountPrice() {
        return platformDiscountPrice;
    }

    public void setPlatformDiscountPrice(Double platformDiscountPrice) {
        this.platformDiscountPrice = platformDiscountPrice;
    }

    @Basic
    @Column(name = "product_id")
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "qr_buy_id")
    public Long getQrBuyId() {
        return qrBuyId;
    }

    public void setQrBuyId(Long qrBuyId) {
        this.qrBuyId = qrBuyId;
    }

    @Basic
    @Column(name = "return_status")
    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    @Basic
    @Column(name = "seller_city_code")
    public String getSellerCityCode() {
        return sellerCityCode;
    }

    public void setSellerCityCode(String sellerCityCode) {
        this.sellerCityCode = sellerCityCode;
    }

    @Basic
    @Column(name = "seller_city_name")
    public String getSellerCityName() {
        return sellerCityName;
    }

    public void setSellerCityName(String sellerCityName) {
        this.sellerCityName = sellerCityName;
    }

    @Basic
    @Column(name = "seller_county_code")
    public String getSellerCountyCode() {
        return sellerCountyCode;
    }

    public void setSellerCountyCode(String sellerCountyCode) {
        this.sellerCountyCode = sellerCountyCode;
    }

    @Basic
    @Column(name = "seller_county_name")
    public String getSellerCountyName() {
        return sellerCountyName;
    }

    public void setSellerCountyName(String sellerCountyName) {
        this.sellerCountyName = sellerCountyName;
    }

    @Basic
    @Column(name = "seller_id")
    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    @Basic
    @Column(name = "seller_name")
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @Basic
    @Column(name = "seller_province_code")
    public String getSellerProvinceCode() {
        return sellerProvinceCode;
    }

    public void setSellerProvinceCode(String sellerProvinceCode) {
        this.sellerProvinceCode = sellerProvinceCode;
    }

    @Basic
    @Column(name = "seller_province_name")
    public String getSellerProvinceName() {
        return sellerProvinceName;
    }

    public void setSellerProvinceName(String sellerProvinceName) {
        this.sellerProvinceName = sellerProvinceName;
    }

    @Basic
    @Column(name = "seller_street_code")
    public String getSellerStreetCode() {
        return sellerStreetCode;
    }

    public void setSellerStreetCode(String sellerStreetCode) {
        this.sellerStreetCode = sellerStreetCode;
    }

    @Basic
    @Column(name = "seller_street_name")
    public String getSellerStreetName() {
        return sellerStreetName;
    }

    public void setSellerStreetName(String sellerStreetName) {
        this.sellerStreetName = sellerStreetName;
    }

    @Basic
    @Column(name = "seller_type")
    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    @Basic
    @Column(name = "shop_city_code")
    public String getShopCityCode() {
        return shopCityCode;
    }

    public void setShopCityCode(String shopCityCode) {
        this.shopCityCode = shopCityCode;
    }

    @Basic
    @Column(name = "shop_city_name")
    public String getShopCityName() {
        return shopCityName;
    }

    public void setShopCityName(String shopCityName) {
        this.shopCityName = shopCityName;
    }

    @Basic
    @Column(name = "shop_county_code")
    public String getShopCountyCode() {
        return shopCountyCode;
    }

    public void setShopCountyCode(String shopCountyCode) {
        this.shopCountyCode = shopCountyCode;
    }

    @Basic
    @Column(name = "shop_county_name")
    public String getShopCountyName() {
        return shopCountyName;
    }

    public void setShopCountyName(String shopCountyName) {
        this.shopCountyName = shopCountyName;
    }

    @Basic
    @Column(name = "shop_discount_price")
    public Double getShopDiscountPrice() {
        return shopDiscountPrice;
    }

    public void setShopDiscountPrice(Double shopDiscountPrice) {
        this.shopDiscountPrice = shopDiscountPrice;
    }

    @Basic
    @Column(name = "shop_id")
    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "shop_name")
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "shop_province_code")
    public String getShopProvinceCode() {
        return shopProvinceCode;
    }

    public void setShopProvinceCode(String shopProvinceCode) {
        this.shopProvinceCode = shopProvinceCode;
    }

    @Basic
    @Column(name = "shop_province_name")
    public String getShopProvinceName() {
        return shopProvinceName;
    }

    public void setShopProvinceName(String shopProvinceName) {
        this.shopProvinceName = shopProvinceName;
    }

    @Basic
    @Column(name = "shop_street_code")
    public String getShopStreetCode() {
        return shopStreetCode;
    }

    public void setShopStreetCode(String shopStreetCode) {
        this.shopStreetCode = shopStreetCode;
    }

    @Basic
    @Column(name = "shop_street_name")
    public String getShopStreetName() {
        return shopStreetName;
    }

    public void setShopStreetName(String shopStreetName) {
        this.shopStreetName = shopStreetName;
    }

    @Basic
    @Column(name = "shop_type")
    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    @Basic
    @Column(name = "sku_desc")
    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    @Basic
    @Column(name = "sku_id")
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Basic
    @Column(name = "sku_props")
    public String getSkuProps() {
        return skuProps;
    }

    public void setSkuProps(String skuProps) {
        this.skuProps = skuProps;
    }

    @Basic
    @Column(name = "source_channel")
    public String getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    @Basic
    @Column(name = "source_order_no")
    public String getSourceOrderNo() {
        return sourceOrderNo;
    }

    public void setSourceOrderNo(String sourceOrderNo) {
        this.sourceOrderNo = sourceOrderNo;
    }

    @Basic
    @Column(name = "source_shop_no")
    public String getSourceShopNo() {
        return sourceShopNo;
    }

    public void setSourceShopNo(String sourceShopNo) {
        this.sourceShopNo = sourceShopNo;
    }

    @Basic
    @Column(name = "subtotal_amount")
    public Double getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(Double subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    @Basic
    @Column(name = "tax_code")
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @Basic
    @Column(name = "tenant_id")
    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "transaction_type")
    public Long getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Long transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DwdMtOrdAllDiEntity that = (DwdMtOrdAllDiEntity) o;
        return Objects.equals(actualSubtotalAmount, that.actualSubtotalAmount) &&
                Objects.equals(address, that.address) &&
                Objects.equals(addressId, that.addressId) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(cateId, that.cateId) &&
                Objects.equals(cateLevel, that.cateLevel) &&
                Objects.equals(cateLevel1Id, that.cateLevel1Id) &&
                Objects.equals(cateLevel1Name, that.cateLevel1Name) &&
                Objects.equals(cateLevel2Id, that.cateLevel2Id) &&
                Objects.equals(cateLevel2Name, that.cateLevel2Name) &&
                Objects.equals(cateLevel3Id, that.cateLevel3Id) &&
                Objects.equals(cateLevel3Name, that.cateLevel3Name) &&
                Objects.equals(cateLevel4Id, that.cateLevel4Id) &&
                Objects.equals(cateLevel4Name, that.cateLevel4Name) &&
                Objects.equals(cateLevel5Id, that.cateLevel5Id) &&
                Objects.equals(cateLevel5Name, that.cateLevel5Name) &&
                Objects.equals(cateName, that.cateName) &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(channelName, that.channelName) &&
                Objects.equals(clientSourceType, that.clientSourceType) &&
                Objects.equals(deliveryAreaCode, that.deliveryAreaCode) &&
                Objects.equals(deliveryAreaName, that.deliveryAreaName) &&
                Objects.equals(deliveryCityCode, that.deliveryCityCode) &&
                Objects.equals(deliveryCityName, that.deliveryCityName) &&
                Objects.equals(deliveryId, that.deliveryId) &&
                Objects.equals(deliveryMobile, that.deliveryMobile) &&
                Objects.equals(deliveryName, that.deliveryName) &&
                Objects.equals(deliveryPhone, that.deliveryPhone) &&
                Objects.equals(deliveryProvinceCode, that.deliveryProvinceCode) &&
                Objects.equals(deliveryProvinceName, that.deliveryProvinceName) &&
                Objects.equals(deliveryStreetCode, that.deliveryStreetCode) &&
                Objects.equals(deliveryStreetName, that.deliveryStreetName) &&
                Objects.equals(deliveryType, that.deliveryType) &&
                Objects.equals(divActivityDiscountAmt, that.divActivityDiscountAmt) &&
                Objects.equals(divCommissionAmt, that.divCommissionAmt) &&
                Objects.equals(divCouponAmt, that.divCouponAmt) &&
                Objects.equals(divFreightAmt, that.divFreightAmt) &&
                Objects.equals(divGiftTotalAmt, that.divGiftTotalAmt) &&
                Objects.equals(divLogisticsCost, that.divLogisticsCost) &&
                Objects.equals(divPlatformDiscountAmt, that.divPlatformDiscountAmt) &&
                Objects.equals(divPointDiscountAmt, that.divPointDiscountAmt) &&
                Objects.equals(divShopDiscountAmt, that.divShopDiscountAmt) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(invoiceNo, that.invoiceNo) &&
                Objects.equals(invoiceTitle, that.invoiceTitle) &&
                Objects.equals(invoiceTitleType, that.invoiceTitleType) &&
                Objects.equals(invoiceType, that.invoiceType) &&
                Objects.equals(isFetch, that.isFetch) &&
                Objects.equals(isQrBuy, that.isQrBuy) &&
                Objects.equals(itemAmt, that.itemAmt) &&
                Objects.equals(itemCode, that.itemCode) &&
                Objects.equals(itemDiscountedPrice, that.itemDiscountedPrice) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemNum, that.itemNum) &&
                Objects.equals(itemPrice, that.itemPrice) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(level, that.level) &&
                Objects.equals(levelId, that.levelId) &&
                Objects.equals(levelName, that.levelName) &&
                Objects.equals(logisticsBear, that.logisticsBear) &&
                Objects.equals(logisticsCompany, that.logisticsCompany) &&
                Objects.equals(memberAreaCode, that.memberAreaCode) &&
                Objects.equals(memberAreaName, that.memberAreaName) &&
                Objects.equals(memberCityCode, that.memberCityCode) &&
                Objects.equals(memberCityName, that.memberCityName) &&
                Objects.equals(memberId, that.memberId) &&
                Objects.equals(memberProvinceCode, that.memberProvinceCode) &&
                Objects.equals(memberProvinceName, that.memberProvinceName) &&
                Objects.equals(memberStreetCode, that.memberStreetCode) &&
                Objects.equals(memberStreetName, that.memberStreetName) &&
                Objects.equals(memberUsername, that.memberUsername) &&
                Objects.equals(needFinanceAudit, that.needFinanceAudit) &&
                Objects.equals(needVisitAudit, that.needVisitAudit) &&
                Objects.equals(newOrderTime, that.newOrderTime) &&
                Objects.equals(newPayTime, that.newPayTime) &&
                Objects.equals(newStatus, that.newStatus) &&
                Objects.equals(offlinePayMethod, that.offlinePayMethod) &&
                Objects.equals(operateType, that.operateType) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderKey, that.orderKey) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(orderTime, that.orderTime) &&
                Objects.equals(orgaName, that.orgaName) &&
                Objects.equals(payAmt, that.payAmt) &&
                Objects.equals(payMethod, that.payMethod) &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(platformDiscountPrice, that.platformDiscountPrice) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(qrBuyId, that.qrBuyId) &&
                Objects.equals(returnStatus, that.returnStatus) &&
                Objects.equals(sellerCityCode, that.sellerCityCode) &&
                Objects.equals(sellerCityName, that.sellerCityName) &&
                Objects.equals(sellerCountyCode, that.sellerCountyCode) &&
                Objects.equals(sellerCountyName, that.sellerCountyName) &&
                Objects.equals(sellerId, that.sellerId) &&
                Objects.equals(sellerName, that.sellerName) &&
                Objects.equals(sellerProvinceCode, that.sellerProvinceCode) &&
                Objects.equals(sellerProvinceName, that.sellerProvinceName) &&
                Objects.equals(sellerStreetCode, that.sellerStreetCode) &&
                Objects.equals(sellerStreetName, that.sellerStreetName) &&
                Objects.equals(sellerType, that.sellerType) &&
                Objects.equals(shopCityCode, that.shopCityCode) &&
                Objects.equals(shopCityName, that.shopCityName) &&
                Objects.equals(shopCountyCode, that.shopCountyCode) &&
                Objects.equals(shopCountyName, that.shopCountyName) &&
                Objects.equals(shopDiscountPrice, that.shopDiscountPrice) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(shopName, that.shopName) &&
                Objects.equals(shopProvinceCode, that.shopProvinceCode) &&
                Objects.equals(shopProvinceName, that.shopProvinceName) &&
                Objects.equals(shopStreetCode, that.shopStreetCode) &&
                Objects.equals(shopStreetName, that.shopStreetName) &&
                Objects.equals(shopType, that.shopType) &&
                Objects.equals(skuDesc, that.skuDesc) &&
                Objects.equals(skuId, that.skuId) &&
                Objects.equals(skuProps, that.skuProps) &&
                Objects.equals(sourceChannel, that.sourceChannel) &&
                Objects.equals(sourceOrderNo, that.sourceOrderNo) &&
                Objects.equals(sourceShopNo, that.sourceShopNo) &&
                Objects.equals(subtotalAmount, that.subtotalAmount) &&
                Objects.equals(taxCode, that.taxCode) &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(transactionType, that.transactionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualSubtotalAmount, address, addressId, brandId, brandName, cateId, cateLevel, cateLevel1Id, cateLevel1Name, cateLevel2Id, cateLevel2Name, cateLevel3Id, cateLevel3Name, cateLevel4Id, cateLevel4Name, cateLevel5Id, cateLevel5Name, cateName, channelId, channelName, clientSourceType, deliveryAreaCode, deliveryAreaName, deliveryCityCode, deliveryCityName, deliveryId, deliveryMobile, deliveryName, deliveryPhone, deliveryProvinceCode, deliveryProvinceName, deliveryStreetCode, deliveryStreetName, deliveryType, divActivityDiscountAmt, divCommissionAmt, divCouponAmt, divFreightAmt, divGiftTotalAmt, divLogisticsCost, divPlatformDiscountAmt, divPointDiscountAmt, divShopDiscountAmt, gender, invoiceNo, invoiceTitle, invoiceTitleType, invoiceType, isFetch, isQrBuy, itemAmt, itemCode, itemDiscountedPrice, itemId, itemName, itemNum, itemPrice, itemType, level, levelId, levelName, logisticsBear, logisticsCompany, memberAreaCode, memberAreaName, memberCityCode, memberCityName, memberId, memberProvinceCode, memberProvinceName, memberStreetCode, memberStreetName, memberUsername, needFinanceAudit, needVisitAudit, newOrderTime, newPayTime, newStatus, offlinePayMethod, operateType, orderId, orderKey, orderNo, orderStatus, orderTime, orgaName, payAmt, payMethod, payTime, platformDiscountPrice, productId, productName, qrBuyId, returnStatus, sellerCityCode, sellerCityName, sellerCountyCode, sellerCountyName, sellerId, sellerName, sellerProvinceCode, sellerProvinceName, sellerStreetCode, sellerStreetName, sellerType, shopCityCode, shopCityName, shopCountyCode, shopCountyName, shopDiscountPrice, shopId, shopName, shopProvinceCode, shopProvinceName, shopStreetCode, shopStreetName, shopType, skuDesc, skuId, skuProps, sourceChannel, sourceOrderNo, sourceShopNo, subtotalAmount, taxCode, tenantId, transactionType);
    }
}
