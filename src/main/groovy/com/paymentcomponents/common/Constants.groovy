package com.paymentcomponents.common

import com.paymentcomponents.common.models.HttpStatusReason
import org.springframework.http.HttpStatus

/**
 * Created by aalexandrakis on 02/04/2017.
 */
class Constants {
    static final String XSRF_TOKEN = 'x-csrf-token'
    static final String IDENTITY_TOKEN = 'identity-token'
    static final String ANONYMOUS_EMAIL = "anonymous@user.org"
    static final String ANONYMOUS_USERNAME = "Anonymous"
    static final String ANONYMOUS_PERMISSIONS = "NONE"
    static final String IDENTITY_COOKIE_PREFIX = "identity_"
    static final String IGNORE_JWT_FILTERS_PATHS_KEY = "ignore.jwt.filter.paths"
    static final String IGNORE_JAT_FILTERS_PATHS_KEY = "ignore.jat.filter.paths"
    static final String DB_DATE_FORMAT = "yyyy-MM-dd";


    static final def REST_ERRORS = [
            //identity
            "invalid_credentials"          : [code: HttpStatus.UNAUTHORIZED, error_description: 'Invalid credentials.'] as HttpStatusReason,
            "session_expired"              : [code: HttpStatus.UNAUTHORIZED, error_description: 'Your session expired.'] as HttpStatusReason,
            "bad_request"                  : [code: HttpStatus.BAD_REQUEST, error_description: 'Invalid input found'] as HttpStatusReason,
            "bad_signature"                : [code: HttpStatus.BAD_REQUEST, error_description: 'Error JWT signature.'] as HttpStatusReason,
            "bad_jat_signature"            : [code: HttpStatus.BAD_REQUEST, error_description: 'Error JAT signature.'] as HttpStatusReason,
            "malformed_jwt_user_email"     : [code: HttpStatus.BAD_REQUEST, error_description: 'User email mismatch.'] as HttpStatusReason,
            "malformed_jwt_referrer"       : [code: HttpStatus.BAD_REQUEST, error_description: 'Referrer mismatch.'] as HttpStatusReason,
            "malformed_jwt_creation_date"  : [code: HttpStatus.BAD_REQUEST, error_description: 'Creation date mismatch.'] as HttpStatusReason,
            "malformed_jwt_expiration_date": [code: HttpStatus.BAD_REQUEST, error_description: 'Expiration date mismatch.'] as HttpStatusReason,
            "malformed_jwt_permissions"    : [code: HttpStatus.BAD_REQUEST, error_description: 'Permissions mismatch.'] as HttpStatusReason,
            "malformed_jat_user_id"        : [code: HttpStatus.BAD_REQUEST, error_description: 'User id mismatch.'] as HttpStatusReason,
            "malformed_jat_referrer"       : [code: HttpStatus.BAD_REQUEST, error_description: 'Referrer mismatch.'] as HttpStatusReason,
            "malformed_jat_creation_date"  : [code: HttpStatus.BAD_REQUEST, error_description: 'Creation date mismatch.'] as HttpStatusReason,
            "malformed_jat_expiration_date": [code: HttpStatus.BAD_REQUEST, error_description: 'Expiration date mismatch.'] as HttpStatusReason,
            "api_token_expired"            : [code: HttpStatus.BAD_REQUEST, error_description: 'Token has expired.'] as HttpStatusReason,
            "forbidden"                    : [code: HttpStatus.FORBIDDEN, error_description: 'Forbidden request.'] as HttpStatusReason,
            "internal_error"               : [code: HttpStatus.INTERNAL_SERVER_ERROR, error_description: 'Internal server error.'] as HttpStatusReason,
            "token_not_found"              : [code: HttpStatus.INTERNAL_SERVER_ERROR, error_description: 'Token not found.'] as HttpStatusReason
    ]

    public enum ERROR_CODES {
        internal_error, invalid_request, instructed_bank_not_found, instructed_bank_url_not_found, constraint_violation, unknown_error, request_forward_error
    }

    public enum CURRENCIES {
        NGN
    }

    public enum CHARGE_BEARER_VALUES {
        DEBT, CRED, SHAR
    }

    public enum CATEGORY_PURSPOSE_VALUES {
        SALARY, MERCHANTPAYMENT
    }

    public enum TRANSACTION_RISK_VALUES {
        BKTR, NUGP, NURG, PRPT, SDVA, URGP, URNS
    }


}
