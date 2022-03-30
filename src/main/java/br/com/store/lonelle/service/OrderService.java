package br.com.store.lonelle.service;

import br.com.store.lonelle.dto.OrderDTO;
import br.com.store.lonelle.model.Customer;
import br.com.store.lonelle.model.Order;
import br.com.store.lonelle.model.Product;
import br.com.store.lonelle.repository.CustomerRepo;
import br.com.store.lonelle.repository.OrderRepo;
import br.com.store.lonelle.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepo orderRepo;
    private final ProductRepo productRepo;
    private final CustomerRepo customerRepo;

    public Order createOrder(OrderDTO dto, Long idCustomer) {

        List<Product> products = new ArrayList<>();
        Customer customer = customerRepo.getById(idCustomer);

        dto.getProductsId().stream().forEach(id -> {

            var product = productRepo.getById(id);
            products.add(product);
        });


        var newOrder = Order.builder()
                .products(products)
                .customer(customer)
                .adress(customer.getAdress())
                .total(dto.getTotal())
                .orderDate(LocalDate.now())
                .build();

        return orderRepo.save(newOrder);
    }

}
