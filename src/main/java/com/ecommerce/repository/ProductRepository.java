package com.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;

/**
 * Product Repository Interface
 * 
 * @author Sourabh Gour
 *
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}
