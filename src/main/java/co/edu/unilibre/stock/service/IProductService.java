package co.edu.unilibre.stock.service;

import java.util.List;

import co.edu.unilibre.stock.entity.Product;

public interface IProductService {
	public List<Product> getAllList();
	public Product getById(Long id);
}
