package com.example.apidemo.database;

import com.example.apidemo.models.Product;
import com.example.apidemo.repositories.ProductRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration // Goi ngay khi ung dung duoc chay
public class Database {
    // logger is the same system.out.println but more perfect
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Database.class);
    @Bean // Goi ngay khi chay chuong trinh
    CommandLineRunner initDatabase(ProductRepository productRepository){
       return new CommandLineRunner() { // tao ra doi tuong thuc thi commandline runner
           @Override
           public void run(String... args) throws Exception {
               Product productA = new Product("Macbook Pro 16", 2020, 2400.0, "");
               Product productB = new Product("iPad Air Green", 2021, 599.0, "");
               logger.info("insert data: " + productRepository.save(productA));
               logger.info("insert data: " + productRepository.save(productB)); // save to database
           }
       };
    }
}
