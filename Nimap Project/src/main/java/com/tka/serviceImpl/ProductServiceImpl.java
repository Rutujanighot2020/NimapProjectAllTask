package com.tka.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;
import com.tka.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	@Override
	public boolean saveProduct(Product product) {

		return dao.saveProduct(product);
	}

	@Override
	public Product getProductById(long productId) {
		return dao.getProductById(productId);
	}

	@Override
	public List<Product> getAllProducts(int pageNumber) {
		return dao.getAllProducts(pageNumber);
	}

	@Override
	public boolean deleteProductById(long productId) {
		return dao.deleteProductById(productId);
	}

	@Override
	public boolean updateProduct(Product product) {
		return dao.updateProduct(product);
	}

}
