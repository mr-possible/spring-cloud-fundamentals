package com.sambhav.couponservice.controllers;

import com.sambhav.couponservice.models.Coupon;
import com.sambhav.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("coupon")
public class CouponController {

    @Autowired
    private CouponRepository couponRepository;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @RequestMapping(value = "get/{couponCode}", method = RequestMethod.GET)
    public Coupon get(@PathVariable("couponCode") String couponCode) {
        return couponRepository.findByCouponCode(couponCode);
    }
}
