package com.paymentcomponents.common.request

/**
 * Created by aalexandrakis on 21/03/2017.
 */
public class EmailRequest {
    String emailId
    String to
    String from
    String subject
    String body
    Attachment[] attachments


    @Override
    public String toString() {
        return "EmailRequest{" +
                "emailId='" + emailId + '\'' +
                ", to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", attachments=" + Arrays.toString(attachments) +
                '}';
    }
}
