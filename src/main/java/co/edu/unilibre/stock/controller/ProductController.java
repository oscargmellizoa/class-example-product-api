package co.edu.unilibre.stock.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.stock.entity.Product;
import co.edu.unilibre.stock.service.IProductService;

@RestController
public class ProductController {
	@Value("${server.port}")
	private Long port;
	
	@Autowired
	private IProductService productService;
	
	@GetMapping("/list")
	public List<Product> getList(){
		return productService.getAllList().stream().map(product -> {
			product.setPort(port);
			return product;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id) {
		Product product = productService.getById(id);
		product.setPort(port);
		return product;
		
	}
}
