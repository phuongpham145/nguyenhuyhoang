package com.example.apidemo.controller;

import com.example.apidemo.models.Product;
import com.example.apidemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Đây là Controller đấy
@RequestMapping(path = "/api/v1/Products") // Định tuyến
public class ProductController {
    @Autowired // auto create an object
    private ProductRepository repository;
    @GetMapping("") // Doc data tra ve danh sach san pham duoi dang string
    List<Product> getAllProducts(){
          return repository.findAll(); // Where is data
        // Danh sach cac string , tra ve luon cho no don gian
        //You must save this to Database, Now we have H2 Db = In-memmory Database
        //YOu can also send request using postman
    }
}