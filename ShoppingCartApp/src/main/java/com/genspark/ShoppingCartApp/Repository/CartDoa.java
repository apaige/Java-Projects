package com.genspark.ShoppingCartApp.Repository;


import com.genspark.ShoppingCartApp.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDoa extends JpaRepository<Cart,Integer> {
}
