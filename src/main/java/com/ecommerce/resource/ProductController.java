package com.ecommerce.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;


/**
 * Product RestController
 * @author Sourabh Gour
 *
 */
@RestController
@CrossOrigin
public class ProductController {

	/**
	 * Injecting productService into ProductController
	 */
	@Autowired
	private ProductService productService;

	/**
	 * @return list of products
	 */
	@GetMapping("/products")
	public List<Product> get() {
		return productService.get();

	}
}
