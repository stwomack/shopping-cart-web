package com.demo.shopping_cart_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;

    @GetMapping("/")
    public String hello() {
        return "This Spring Boot app is generating ShoppingCarts and storing them in Redis";
    }

    @GetMapping("/shoppingcarts")
    public Iterable<ShoppingCart> getShoppingCarts() {
        return shoppingCartService.getAllCarts();
    }

    @GetMapping("/shoppingcart")
    public ShoppingCart getShoppingCarts(@PathVariable String userId) {
        return shoppingCartService.getCart(userId);
    }
}
