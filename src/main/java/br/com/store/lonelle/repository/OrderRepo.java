package br.com.store.lonelle.repository;

import br.com.store.lonelle.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
