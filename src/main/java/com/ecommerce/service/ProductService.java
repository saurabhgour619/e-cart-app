package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Product;

/**
 * Product Service Interface
 * 
 * @author Sourabh Gour
 *
 */
public interface ProductService {

	/**
	 * @return list of products
	 */
	public List<Product> get();
}
