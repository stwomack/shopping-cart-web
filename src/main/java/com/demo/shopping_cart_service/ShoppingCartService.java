package com.demo.shopping_cart_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@EnableScheduling
public class ShoppingCartService {
    private final Logger log = LoggerFactory.getLogger(ShoppingCartService.class);

    @Autowired
    private ShoppingCartRepository cartRepository;

    public ShoppingCart getCart(String userId) {
        return cartRepository.findById(userId).orElse(null);
    }

    public Iterable<ShoppingCart> getAllCarts() {
        return cartRepository.findAll();
    }
}