package com.product.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Product;
@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
   
	
	
	
	
	
	
}
