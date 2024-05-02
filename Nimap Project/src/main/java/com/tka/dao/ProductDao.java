package com.tka.dao;

import java.util.List;

import com.tka.entity.Product;

public interface ProductDao {
	public boolean saveProduct(Product product);

	public Product getProductById(long productId);

	public List<Product> getAllProducts(int pageNumber);

	public boolean deleteProductById(long productId);

	public boolean updateProduct(Product product);


}
