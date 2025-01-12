package com.demo.shopping_cart_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;

    @GetMapping("/")
    public String hello() {
        return "index"; // Return the name of the HTML template
    }

    @GetMapping("/shoppingcarts")
    public String getAllCarts(Model model) {
        model.addAttribute("carts", shoppingCartService.getAllCarts());
        return "shoppingcarts"; // Return the name of the HTML template
    }

    @GetMapping("/shoppingcart/{userId}")
    public String getCart(@PathVariable String userId, Model model) {
        ShoppingCart cart = shoppingCartService.getCart(userId);
        if (cart != null) {
            model.addAttribute("cart", cart);
            return "shoppingcart"; // Return the name of the HTML template
        } else {
            return "cartNotFound"; // Return the name of the HTML template
        }
    }
}