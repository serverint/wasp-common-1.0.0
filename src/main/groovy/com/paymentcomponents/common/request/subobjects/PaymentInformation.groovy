package com.paymentcomponents.common.request.subobjects
/**
 * Created by aalexandrakis on 17/05/2017.
 */
class PaymentInformation {

    String merchantName
    BigDecimal transactionAmount
    BigDecimal taxAmount
    Date transactionDate
    String customerCodeOrPoNumber
    String merchantAddress
    String fromZipCode
    String toZipCode
    String invoiceNumber
    String orderNumber
    String itemCommodityCode
    String itemDescription
    Integer itemQuantity
    String itemUnitOfMeasure
    Integer itemExtendedAmount
    Float vatTaxRate
    BigDecimal vatTaxAmount

    PaymentInformation(String merchantName, BigDecimal transactionAmount, BigDecimal taxAmount, Date transactionDate, String customerCodeOrPoNumber, String merchantAddress, String fromZipCode, String toZipCode, String invoiceNumber, String orderNumber, String itemCommodityCode, String itemDescription, Integer itemQuantity, String itemUnitOfMeasure, Integer itemExtendedAmount, Float vatTaxRate, BigDecimal vatTaxAmount) {
        this.merchantName = merchantName
        this.transactionAmount = transactionAmount
        this.taxAmount = taxAmount
        this.transactionDate = transactionDate
        this.customerCodeOrPoNumber = customerCodeOrPoNumber
        this.merchantAddress = merchantAddress
        this.fromZipCode = fromZipCode
        this.toZipCode = toZipCode
        this.invoiceNumber = invoiceNumber
        this.orderNumber = orderNumber
        this.itemCommodityCode = itemCommodityCode
        this.itemDescription = itemDescription
        this.itemQuantity = itemQuantity
        this.itemUnitOfMeasure = itemUnitOfMeasure
        this.itemExtendedAmount = itemExtendedAmount
        this.vatTaxRate = vatTaxRate
        this.vatTaxAmount = vatTaxAmount
    }

    PaymentInformation() {
    }

    String getMerchantName() {
        return merchantName
    }

    void setMerchantName(String merchantName) {
        this.merchantName = merchantName
    }

    BigDecimal getTransactionAmount() {
        return transactionAmount
    }

    void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount
    }

    BigDecimal getTaxAmount() {
        return taxAmount
    }

    void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount
    }

    Date getTransactionDate() {
        return transactionDate
    }

    void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate
    }

    String getCustomerCodeOrPoNumber() {
        return customerCodeOrPoNumber
    }

    void setCustomerCodeOrPoNumber(String customerCodeOrPoNumber) {
        this.customerCodeOrPoNumber = customerCodeOrPoNumber
    }

    String getMerchantAddress() {
        return merchantAddress
    }

    void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress
    }

    String getFromZipCode() {
        return fromZipCode
    }

    void setFromZipCode(String fromZipCode) {
        this.fromZipCode = fromZipCode
    }

    String getToZipCode() {
        return toZipCode
    }

    void setToZipCode(String toZipCode) {
        this.toZipCode = toZipCode
    }

    String getInvoiceNumber() {
        return invoiceNumber
    }

    void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber
    }

    String getOrderNumber() {
        return orderNumber
    }

    void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber
    }

    String getItemCommodityCode() {
        return itemCommodityCode
    }

    void setItemCommodityCode(String itemCommodityCode) {
        this.itemCommodityCode = itemCommodityCode
    }

    String getItemDescription() {
        return itemDescription
    }

    void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription
    }

    Integer getItemQuantity() {
        return itemQuantity
    }

    void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity
    }

    String getItemUnitOfMeasure() {
        return itemUnitOfMeasure
    }

    void setItemUnitOfMeasure(String itemUnitOfMeasure) {
        this.itemUnitOfMeasure = itemUnitOfMeasure
    }

    Integer getItemExtendedAmount() {
        return itemExtendedAmount
    }

    void setItemExtendedAmount(Integer itemExtendedAmount) {
        this.itemExtendedAmount = itemExtendedAmount
    }

    Float getVatTaxRate() {
        return vatTaxRate
    }

    void setVatTaxRate(Float vatTaxRate) {
        this.vatTaxRate = vatTaxRate
    }

    BigDecimal getVatTaxAmount() {
        return vatTaxAmount
    }

    void setVatTaxAmount(BigDecimal vatTaxAmount) {
        this.vatTaxAmount = vatTaxAmount
    }


    @Override
    public String toString() {
        return "PaymentInformation{" +
                "merchantName='" + merchantName + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", taxAmount=" + taxAmount +
                ", transactionDate=" + transactionDate +
                ", customerCodeOrPoNumber='" + customerCodeOrPoNumber + '\'' +
                ", merchantAddress='" + merchantAddress + '\'' +
                ", fromZipCode='" + fromZipCode + '\'' +
                ", toZipCode='" + toZipCode + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", itemCommodityCode='" + itemCommodityCode + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", itemUnitOfMeasure='" + itemUnitOfMeasure + '\'' +
                ", itemExtendedAmount=" + itemExtendedAmount +
                ", vatTaxRate=" + vatTaxRate +
                ", vatTaxAmount=" + vatTaxAmount +
                '}';
    }
}
