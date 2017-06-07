package com.paymentcomponents.common.request

/**
 * Created by aalexandrakis on 21/03/2017.
 */
public class Attachment {
    String name;
    byte[] attachment;
    String contentType;


    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + name + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }

}