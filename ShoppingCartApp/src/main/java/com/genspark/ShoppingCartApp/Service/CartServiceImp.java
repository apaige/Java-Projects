package com.genspark.ShoppingCartApp.Service;

import com.genspark.ShoppingCartApp.Entity.Cart;
import com.genspark.ShoppingCartApp.Repository.CartDoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImp implements CartService {

    List<Cart> prods;

    @Autowired
    private CartDoa cartDoa;

    @Override
    public List<Cart> getAllProducts() {
        return this.cartDoa.findAll();
    }

    @Override
    public Cart getProductById(int productId) {

        Optional <Cart> p = this.cartDoa.findById(productId);
        Cart product = null;
        if(p.isPresent()){
            product = p.get();
        }else{
            throw new RuntimeException(("Product not found for id :: "+ productId));
        }

        return product;
    }

    @Override
    public Cart addProductToCart(Cart product) {
        return this.cartDoa.save(product);
    }

    @Override
    public Cart updateProductQuantity(Cart product) {
        return this.cartDoa.save(product);
    }

    @Override
    public String deleteProductFromCart(int productId) {
        this.cartDoa.deleteById(productId);
        return "Deleted Successfully";
    }
}
