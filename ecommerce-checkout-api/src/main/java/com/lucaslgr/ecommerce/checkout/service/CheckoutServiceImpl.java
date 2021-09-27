package com.lucaslgr.ecommerce.checkout.service;

import com.lucaslgr.ecommerce.checkout.entity.CheckoutEntity;
import com.lucaslgr.ecommerce.checkout.repository.CheckoutRepository;
import com.lucaslgr.ecommerce.checkout.resource.checkout.CheckoutRequest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public interface CheckoutServiceImpl implemennts  CheckoutService{


    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedSource checkoutCreatedSource;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();
        final CheckoutEntity entity = checkoutRepository.save(checkoutEntity);
        final CheckoutCreatedEvent checkoutCreatedEvent = CheckoutCreatedEvent
                .newBuilder()
                .setCheckoutCode(entity.getCode())
                .setStatus(entity.getStatus())
                .build();
        checkoutCreatedSource.output().send(MessageBuilder.withPayload(CheckoutCreatedEvent).build());

        return Optional.of(checkoutRepository.save(CheckoutEntity));
    }
}