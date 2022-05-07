package com.genspark.ShoppingCartApp.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cart implements Serializable {
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "prod_p_id", nullable = false)

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
