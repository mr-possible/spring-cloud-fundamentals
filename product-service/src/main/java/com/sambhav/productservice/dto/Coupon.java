package com.sambhav.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@ToString
public class Coupon {
    private String id;
    private String couponCode;
    private BigDecimal discount;
    private String expiryDate;
}
