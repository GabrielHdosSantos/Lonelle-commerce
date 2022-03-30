package br.com.store.lonelle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AdressDTO {

    private String street;

    private String cep;

    private int number;

    private String reference;


}
