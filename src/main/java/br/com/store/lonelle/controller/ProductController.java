package br.com.store.lonelle.controller;

import br.com.store.lonelle.dto.ProductDTO;
import br.com.store.lonelle.model.Product;
import br.com.store.lonelle.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO){
        Product newProduct = productService.createProduct(productDTO);

        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);

    }

    @PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        Product newProduct = productService.updateProduct(product);

        return new ResponseEntity<>(newProduct, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAllProducts(){
        List<ProductDTO> products = productService.findAllProducts();

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDTO> findProductById(@PathVariable Long id){
        ProductDTO findProduct = productService.findProductById(id);

        return new ResponseEntity<>(findProduct, HttpStatus.OK);
    }


}
