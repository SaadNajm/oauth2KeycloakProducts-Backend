package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
   @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args->{
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Ordinateur").price(32000).quantity(12).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Nintendo Switch").price(4000).quantity(3).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Ipad").price(32000).quantity(12).build());
        };
   }
}
