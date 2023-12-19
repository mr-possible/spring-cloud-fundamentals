package com.sambhav.productservice.restclients;

import com.sambhav.productservice.dto.Coupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("API-GATEWAY")
public interface CouponClient {
    @GetMapping("coupon/get/{couponCode}")
    Coupon getCoupon(@PathVariable("couponCode") String couponCode);
}
