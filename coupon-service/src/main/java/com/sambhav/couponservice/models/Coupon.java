package com.sambhav.couponservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "coupon")
@Data
@AllArgsConstructor
@ToString
public class Coupon {
    @Id
    private String id;
    private String couponCode;
    private BigDecimal discount;
    private String expiryDate;
}