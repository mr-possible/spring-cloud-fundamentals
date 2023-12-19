package com.sambhav.productservice.controllers;

import com.sambhav.productservice.dto.Coupon;
import com.sambhav.productservice.models.Product;
import com.sambhav.productservice.repository.ProductRepository;
import com.sambhav.productservice.restclients.CouponClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CouponClient couponClient;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        Coupon coupon = couponClient.getCoupon(product.getCouponCode().trim());
        product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
        return productRepository.save(product);
    }
}
