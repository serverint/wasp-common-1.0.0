package com.paymentcomponents.common.models

/**
 * Created by aalexandrakis on 23/02/2017.
 */
public class Role {
    private String role

    Role(String role) {
        this.role = role
    }

    Role() {
    }


    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                '}';
    }

    String getRole() {
        return role
    }

    void setRole(String role) {
        this.role = role
    }
}
