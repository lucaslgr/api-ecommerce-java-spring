package com.lucaslgr.ecommerce.payment.config;

import com.lucaslgr.ecommerce.payment.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(CheckoutProcessor.class)
public class StreamingConfig {
}
