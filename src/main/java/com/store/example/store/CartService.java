package com.store.example.store;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(Integer itemId) {
        cart.addItem(itemId);
    }

    public List<Integer> getItems() {
        return cart.getItems();
    }
}
