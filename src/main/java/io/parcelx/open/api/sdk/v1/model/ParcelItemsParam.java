package io.parcelx.open.api.sdk.v1.model;

import java.math.BigDecimal;


public class ParcelItemsParam {
    /** 包裹编号 */
    private String parcelNo;
    /** 货物编号 */
    private String itemNo;
    /** 海关识别码 */
    private String hsCode;
    /** 商家订单编号 */
    private String onlineOrderNo;
    /** 条形码 */
    private String barCode;
    /** 品牌 */
    private String brand;
    /** 货物sku */
    private String productSKU;
    /** 货物名称 */
    private String productName;
    /** 本地化货物名称 */
    private String nativeProductName;
    /** 商品类型 */
    private String productType;
    /** 货物描述 */
    private String productDescription;
    /** 货物单位 */
    private String productUnit;
    /** 商品url */
    private String url;
    /** 原产地 */
    private String origin;
    /** 规格 */
    private String specification;
    /** 毛重 */
    private BigDecimal grossWeight;
    /** 净重 */
    private BigDecimal netWeight;
    /** 重量单位 */
    private String weightUnit;
    /** 单价 */
    private BigDecimal unitPrice;
    /** 币种 */
    private String currency;
    /** 单位 JGS-20 海关业务代码集 */
    private String unit;
    /** 数量 */
    private Integer quantity;
    /** 金额 */
    private BigDecimal amount;
    /** 库位，如产品已在集货仓，则传递库位信息 */
    private String warehouseNo;
    /** 扩展字段1 */
    private String ext1;

    public String getParcelNo() {
        return parcelNo;
    }

    public void setParcelNo(String parcelNo) {
        this.parcelNo = parcelNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getOnlineOrderNo() {
        return onlineOrderNo;
    }

    public void setOnlineOrderNo(String onlineOrderNo) {
        this.onlineOrderNo = onlineOrderNo;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNativeProductName() {
        return nativeProductName;
    }

    public void setNativeProductName(String nativeProductName) {
        this.nativeProductName = nativeProductName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }
}