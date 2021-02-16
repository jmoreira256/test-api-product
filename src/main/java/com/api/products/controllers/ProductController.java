package com.api.products.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.api.products.models.ProductsModel;
import com.api.products.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<ProductsModel> getProducts(){
        return productService.getProducts();
    }

    @PostMapping()
    public ProductsModel saveProduct(@RequestBody ProductsModel product){
        return this.productService.saveProduct(product);
    }

    @GetMapping( path = "/{id}")
    public Optional<ProductsModel> getProductById(@PathVariable("id") Long id) {
        return this.productService.getProductById(id);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.productService.deleteProduct(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}