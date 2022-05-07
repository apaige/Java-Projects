package com.genspark.ShoppingCartApp.Entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

    public User() {
    }

    public User(String name, Cart cart) {
        this.name = name;
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
