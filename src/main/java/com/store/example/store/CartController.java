package com.store.example.store;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public void addItemsToCart(@RequestParam("ids") List<Integer> ids) {
        ids.forEach(cartService::addToCart);
    }

    @GetMapping("/get")
    public List<Integer> getItemsFromCart() {
        return cartService.getItems();
    }
}