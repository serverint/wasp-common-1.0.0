package com.paymentcomponents.common.models.response

import groovy.transform.TupleConstructor


/**
 * Created by aalexandrakis on 27/03/2017.
 */
@TupleConstructor
class ListResponse<T> {
    T payload
    long size;
    long totalElements;
    long totalPages;
    long number;

}

