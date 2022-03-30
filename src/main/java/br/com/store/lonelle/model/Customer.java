package br.com.store.lonelle.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_customer")
@SuperBuilder
public class Customer extends User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthday;

    private String cpf;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @OneToOne
    private Adress adress;

    public Customer(Long id, String username, String password, String name, LocalDate birthday, String cpf, List<Order> orders, Adress adress) {
        super(id, username, password);
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.orders = orders;
        this.adress = adress;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
