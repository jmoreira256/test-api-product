package com.api.products.services;

import java.util.ArrayList;
import java.util.Optional;

import com.api.products.models.ProductsModel;
import com.api.products.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository ProductRepository;
    
    public ArrayList<ProductsModel> getProducts(){
        return (ArrayList<ProductsModel>) ProductRepository.findAll();
    }

    public ProductsModel saveProduct(ProductsModel product){
        return ProductRepository.save(product);
    }

    public Optional<ProductsModel> getProductById(Long id){
        return ProductRepository.findById(id);
    }

    public boolean deleteProduct(Long id) {
        try{
            ProductRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}