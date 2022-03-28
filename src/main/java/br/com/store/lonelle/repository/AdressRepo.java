package br.com.store.lonelle.repository;

import br.com.store.lonelle.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepo extends JpaRepository<Adress, Long> {
}
