package com.lucaslgr.ecommerce.checkout.service;

import com.lucaslgr.ecommerce.checkout.entity.CheckoutEntity;
import com.lucaslgr.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}