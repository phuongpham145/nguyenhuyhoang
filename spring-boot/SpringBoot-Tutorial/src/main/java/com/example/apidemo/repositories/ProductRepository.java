package com.example.apidemo.repositories;
// Noi chua database ke thua tu thu vien jpa
import com.example.apidemo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
