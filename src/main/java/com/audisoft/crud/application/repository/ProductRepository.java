package com.audisoft.crud.application.repository;


import com.audisoft.crud.domain.Product;

import java.util.List;

public interface ProductRepository {

	 Product findById(Long id);
	
	 void saveProduct(Product product);
	
	 List<Product> getAllProduct();

	 Product updateProduct(Long id, Product product);
}
