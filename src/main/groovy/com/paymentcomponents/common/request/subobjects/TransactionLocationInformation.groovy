package com.paymentcomponents.common.request.subobjects
/**
 * Created by t.logothetis on 5/17/2017.
 */

class TransactionLocationInformation {
    private BigDecimal transactionLocationLong
    private BigDecimal transactionLocationLat

    TransactionLocationInformation() {
    }

    TransactionLocationInformation(BigDecimal transactionLocationLong, BigDecimal transactionLocationLat) {
        this.transactionLocationLong = transactionLocationLong
        this.transactionLocationLat = transactionLocationLat
    }

    BigDecimal getTransactionLocationLong() {
        return transactionLocationLong
    }

    void setTransactionLocationLong(BigDecimal transactionLocationLong) {
        this.transactionLocationLong = transactionLocationLong
    }

    BigDecimal getTransactionLocationLat() {
        return transactionLocationLat
    }

    void setTransactionLocationLat(BigDecimal transactionLocationLat) {
        this.transactionLocationLat = transactionLocationLat
    }

    @Override
    String toString() {
        return "TransactionLocationInformation{" +
                "transactionLocationLong=" + transactionLocationLong +
                ", transactionLocationLat=" + transactionLocationLat +
                '}'
    }
}

