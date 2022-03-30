package br.com.store.lonelle.service;

import br.com.store.lonelle.dto.CustomerDTO;
import br.com.store.lonelle.mapper.CustomerMapper;
import br.com.store.lonelle.model.Customer;
import br.com.store.lonelle.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo customerRepo;
    private final CustomerMapper mapper;


    public Customer createCustomer(CustomerDTO dto) {

        var customer = mapper.toCustomer(dto);

        return customerRepo.save(customer);

    }

    public Customer updateCustomer(CustomerDTO dto, Long id) {

        var customer = mapper.toCustomer(dto);
        customer.setId(id);

        return customerRepo.save(customer);

    }

    public List<Customer> findAllCustomer() {

        List<Customer> customers = customerRepo.findAll();

        customers.stream().map(customer -> Customer

                .builder()
                .name(customer.getName())
                .birthday(customer.getBirthday())
                .cpf(customer.getCpf())
                .adress(customer.getAdress()))
                 .collect(Collectors.toList());

        return customers;
    }


}
