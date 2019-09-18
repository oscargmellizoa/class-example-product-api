package co.edu.unilibre.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unilibre.stock.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{

}
