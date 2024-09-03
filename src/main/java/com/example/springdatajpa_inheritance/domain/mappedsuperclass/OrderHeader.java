package com.example.springdatajpa_inheritance.domain.mappedsuperclass;

import jakarta.persistence.Entity;

@Entity
public class OrderHeader extends BaseEntity {
    
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
