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
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepo orderRepo;
    private final ProductRepo productRepo;
    private final CustomerRepo customerRepo;

    public Order createOrder(OrderDTO dto, Long idCustomer) {

        List<Order> orders = new ArrayList<>();
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

        customer.relations(orders);
            customerRepo.save(customer);

        return orderRepo.save(newOrder);
    }

    public List<Order> findOrderByCustomer_id(Long id) {

        List<Order> orders = orderRepo.findByCustomerId(id)
                .orElseThrow(() -> new IllegalStateException("Any order could be found"));

        return orders;
    }

    public List<Order> findAllOrders() {
        List<Order> orders = orderRepo.findAll();

        return orders;
    }


}
