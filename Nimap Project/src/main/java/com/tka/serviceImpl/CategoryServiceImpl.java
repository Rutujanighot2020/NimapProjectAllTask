package com.tka.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CategoryDao;
import com.tka.entity.Category;
import com.tka.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao dao;

	@Override
	public boolean saveCategory(Category category) {
		boolean isAdded = dao.saveCategory(category);
		return isAdded;
	}

	@Override
	public Category getCategoryById(long id) {
		return dao.getCategoryById(id);
	}

	@Override
	public List<Category> getAllCategory() {
		return dao.getAllCategory();
	}

	@Override
	public boolean updateCategory(Category category) {
		return dao.updateCategory(category);
	}

	@Override
	public boolean deleteCategory(long categoryId) {
		return dao.deleteCategory(categoryId);
	}

}
