package br.com.store.lonelle.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tb_adress")
@Inheritance(strategy = InheritanceType.JOINED)
public class Adress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Street;

    private String cep;

    private int number;

    private String reference;


}
