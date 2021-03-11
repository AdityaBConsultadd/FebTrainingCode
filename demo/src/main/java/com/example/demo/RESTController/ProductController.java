package com.example.demo.RESTController;

import com.example.demo.Model.Product;
import com.example.demo.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepo productRepo;

    @GetMapping("/get")
    List<Product> get(){
        return productRepo.findAll();
    }
}
