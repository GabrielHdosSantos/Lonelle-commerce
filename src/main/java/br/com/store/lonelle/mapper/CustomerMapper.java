package br.com.store.lonelle.mapper;

import br.com.store.lonelle.dto.CustomerDTO;
import br.com.store.lonelle.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toCustomer(CustomerDTO dto){

        var customer = Customer
                .builder()
                .name(dto.getName())
                .birthday(dto.getBirthday())
                .adress(dto.getAdress())
                .username(dto.getUsername())
                .password(dto.getPassword())
                .build();


        return customer;

    }

    public CustomerDTO toDto(Customer customer){

        var dto = CustomerDTO
                .builder()
                .name(customer.getName())
                .birthday(customer.getBirthday())
                .adress(customer.getAdress())
                .username(customer.getUsername())
                .password(customer.getPassword())
                .build();

        return dto;

    }



}
