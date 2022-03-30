package br.com.store.lonelle.repository;

import br.com.store.lonelle.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order, Long> {

    Optional<List<Order>> findByCustomerId(Long id);


}
