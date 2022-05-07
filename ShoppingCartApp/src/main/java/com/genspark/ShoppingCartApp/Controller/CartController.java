package com.genspark.ShoppingCartApp.Controller;

import com.genspark.ShoppingCartApp.Entity.Cart;
import com.genspark.ShoppingCartApp.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {
    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to The Shopping Cart App!</H1></HTML>";
    }

    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public List<Cart> getProducts() {
        return this.cartService.getAllProducts();
    }

    @GetMapping("/products/{productID}")
    public Cart getProduct(@PathVariable String productID) {
        return this.cartService.getProductById(Integer.parseInt(productID));
    }

    @PostMapping("/products")
    public Cart addProduct(@RequestBody Cart product) {

        return this.cartService.addProductToCart(product);
    }

    @PutMapping("/products")
    public Cart updateProduct(@RequestBody Cart product) {
        return this.cartService.updateProductQuantity(product);
    }

    @DeleteMapping("/products/{productID}")
    public String deleteProduct(@PathVariable String productID) {
        return this.cartService.deleteProductFromCart(Integer.parseInt(productID));
    }
}
