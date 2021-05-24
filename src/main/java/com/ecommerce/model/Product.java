package com.ecommerce.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Product entity bean
 * @author Sourabh Gour
 *
 */
@Getter
@Setter
@ToString
@Document(collection = "product")
public class Product {

	@Id
	private BigInteger id;
	private String name;
	private Integer price;
	private String rating;
	private String url;
}
