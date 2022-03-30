package br.com.store.lonelle.dto;

import br.com.store.lonelle.model.Adress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {

    private String name;

    private LocalDate birthday;

    private String cpf;

    private Adress adress;

    private String username;

    private String password;

}