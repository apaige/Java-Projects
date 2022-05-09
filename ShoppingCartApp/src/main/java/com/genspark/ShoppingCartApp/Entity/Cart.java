package com.genspark.ShoppingCartApp.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cart")
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany()

    private Product prod;
    private float total;

    public Cart() {
    }

    public Cart(Product prod, float total) {
        this.prod = prod;
        this.total = total;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
