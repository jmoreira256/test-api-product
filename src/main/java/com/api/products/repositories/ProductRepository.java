package com.api.products.repositories;

import com.api.products.models.ProductsModel;

import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
@Document(collection = "products-list")
public interface ProductRepository extends MongoRepository<ProductsModel, Long> {

}