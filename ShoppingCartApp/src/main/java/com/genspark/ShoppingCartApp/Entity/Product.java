package com.genspark.ShoppingCartApp.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_products")
public class Product {

    @Id
    @Column(name="p_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String prodName;
    private int quantity;
    private float price;

    public Product() {
    }

    public Product(int productId, String prodName, int quantity, float price) {
        this.productId = productId;
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
