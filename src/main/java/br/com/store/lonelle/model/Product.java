package br.com.store.lonelle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Table(name = "tb_product")
@Entity
@AllArgsConstructor
@Builder
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    private String description;

    //todo Add MultiPartFile
    private String imageUrl;

    @ManyToOne
    private Order order;


}
