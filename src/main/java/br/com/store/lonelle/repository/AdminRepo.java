package br.com.store.lonelle.repository;

import br.com.store.lonelle.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
}
