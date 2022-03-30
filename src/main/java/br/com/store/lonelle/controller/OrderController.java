package br.com.store.lonelle.controller;

import br.com.store.lonelle.dto.OrderDTO;
import br.com.store.lonelle.model.Order;
import br.com.store.lonelle.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;


    @PostMapping("/{id}")
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO dto, @PathVariable Long id) {

        Order order = orderService.createOrder(dto, id);

        return new ResponseEntity<>(order, HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Order>> findOrderByCustomerId(@PathVariable Long id) {

        List<Order> orders = orderService.findOrderByCustomer_id(id);

        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Order>> findAllOrders() {

        List<Order> orders = orderService.findAllOrders();

        return new ResponseEntity<>(orders, HttpStatus.OK);
    }


}
