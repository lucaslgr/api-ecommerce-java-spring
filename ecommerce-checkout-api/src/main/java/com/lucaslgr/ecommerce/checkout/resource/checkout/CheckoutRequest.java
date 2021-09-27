package com.lucaslgr.ecommerce.checkout.resource.checkout;

import lombok.Data;
import java.io.Serializable

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private Boolean saveAddress;
    private Boolean saveInfo;
    private String paymentMethod;
    private String cardNome;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;
}