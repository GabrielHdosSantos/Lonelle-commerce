package br.com.store.lonelle.model;

import br.com.store.lonelle.enums.OrderStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Product> products;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Adress adress;

    private BigDecimal total;

    private LocalDate orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;



}
