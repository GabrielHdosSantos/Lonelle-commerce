package br.com.store.lonelle.model;

import br.com.store.lonelle.enums.ChargingStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Table(name = "tb_charging")
@Entity
public class Charging implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Order order;

    private LocalDate chargingDate;

    @Enumerated(EnumType.STRING)
    private ChargingStatus chargingStatus;



}
