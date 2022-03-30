package br.com.store.lonelle.mapper;

import br.com.store.lonelle.dto.AdressDTO;
import br.com.store.lonelle.model.Adress;
import org.springframework.stereotype.Component;

@Component
public class AdressMapper {

    public Adress toAdress(AdressDTO dto){

        var adress = Adress.builder()
                .street(dto.getStreet())
                .cep(dto.getCep())
                .number(dto.getNumber())
                .reference(dto.getReference())
                .build();

        return adress;
    }

    public AdressDTO toDTO(Adress adress){

        var dto = AdressDTO.builder()
                .street(adress.getStreet())
                .cep(adress.getCep())
                .number(adress.getNumber())
                .reference(adress.getReference())
                .build();

        return dto;
    }


}
