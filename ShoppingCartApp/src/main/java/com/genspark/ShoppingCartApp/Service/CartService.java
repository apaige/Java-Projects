package com.genspark.ShoppingCartApp.Service;

import com.genspark.ShoppingCartApp.Entity.Cart;


import java.util.List;

public interface CartService {
    List<Cart> getAllProducts();
    Cart getProductById(int productId);
    Cart addProductToCart(Cart product);
    Cart updateProductQuantity(Cart product);
    String deleteProductFromCart(int productId);

}
