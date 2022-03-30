package br.com.store.lonelle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User implements Serializable, UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

}
