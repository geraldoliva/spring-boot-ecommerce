package com.geraldoliva.ecommerce.dto;

import com.geraldoliva.ecommerce.entity.Address;
import com.geraldoliva.ecommerce.entity.Customer;
import com.geraldoliva.ecommerce.entity.Order;
import com.geraldoliva.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
