package com.genspark.ShoppingCartApp.Entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart")
    @Id
    private Cart cart;

    public User() {
    }

    public User(String name) {
        this.name = name;
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
