package co.edu.unilibre.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.stock.entity.Product;
import co.edu.unilibre.stock.service.IProductService;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@GetMapping("/list")
	public List<Product> getList(){
		return productService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id) {
		return productService.getById(id);
	}
}
