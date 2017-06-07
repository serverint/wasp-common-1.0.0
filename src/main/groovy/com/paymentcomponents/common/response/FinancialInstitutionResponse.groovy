package com.paymentcomponents.common.response

import com.paymentcomponents.common.models.Bank
import com.paymentcomponents.common.request.FinancialInstitutionRequest

class FinancialInstitutionResponse extends FinancialInstitutionRequest  {
    String responseCode

   String transactionLocation
   String numberOfRecords
   List<Bank> records
}