package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;

/**
 * Implementation of product service
 * 
 * @author Sourabh Gour
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	/**
	 * Injecting product repository in ProductServiceImpl
	 */
	@Autowired
	private ProductRepository productRepository;

	/**
	 * @return list of products
	 */
	public List<Product> get() {
		return productRepository.findAll();

	}
}
