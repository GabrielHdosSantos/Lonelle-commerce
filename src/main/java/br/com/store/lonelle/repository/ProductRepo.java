package br.com.store.lonelle.repository;

import br.com.store.lonelle.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
