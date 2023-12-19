package com.sambhav.couponservice.repository;

import com.sambhav.couponservice.models.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CouponRepository extends MongoRepository<Coupon, Long> {
    Coupon findByCouponCode(String couponCode);
}
