package com.geraldoliva.ecommerce.service;

import com.geraldoliva.ecommerce.dto.Purchase;
import com.geraldoliva.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
