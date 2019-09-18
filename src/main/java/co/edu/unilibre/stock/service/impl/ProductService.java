package co.edu.unilibre.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.stock.entity.Product;
import co.edu.unilibre.stock.repository.IProductRepository;
import co.edu.unilibre.stock.service.IProductService;

@Service
public class ProductService implements IProductService{

	@Autowired
	private IProductRepository productRepository;
	
	@Override
	public List<Product> getAllList() {
		return productRepository.findAll();
	}

	@Override
	public Product getById(Long id) {
		return productRepository.findById(id).get();
	}
	
}
