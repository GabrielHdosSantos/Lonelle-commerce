package br.com.store.lonelle.repository;

import br.com.store.lonelle.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
