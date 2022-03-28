package br.com.store.lonelle.repository;

import br.com.store.lonelle.model.Charging;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargingRepo extends JpaRepository<Charging, Long> {
}
