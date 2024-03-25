package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
   
	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public Product saveProduct(Product product) {

		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepo.findAll();
	}

	public Product getProductById(String id) {
		
		return productRepo.findById(id).get();
	}

	public String deleteProduct(String id) {
	Product product=productRepo.findById(id).get();
	if(product!=null) {
		productRepo.delete(product);
		return "Product Deleted Successfully";
	}
	return "Something wrong on server";
		
	}

	public Product updateProduct(Product p, String id) {
		Product oldproduct=productRepo.findById(id).get();
		oldproduct.setProductName(p.getProductName());
		oldproduct.setDescription(p.getDescription());
		oldproduct.setPrice(p.getPrice());
		oldproduct.setStatus(p.getStatus());
		
		return productRepo.save(oldproduct);
	}
  
}
