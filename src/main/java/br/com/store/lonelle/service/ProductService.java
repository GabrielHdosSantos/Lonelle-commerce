package br.com.store.lonelle.service;

import br.com.store.lonelle.dto.ProductDTO;
import br.com.store.lonelle.mapper.ProductMapper;
import br.com.store.lonelle.model.Product;
import br.com.store.lonelle.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;
    private final ProductMapper mapper;


    public Product createProduct(ProductDTO productDTO){

        var product = mapper.toProduct(productDTO);

        return productRepo.save(product);

    }

    public Product updateProduct(Product product){

        return productRepo.save(product);

    }

    public List<ProductDTO> findAllProducts(){

        List<Product> products = productRepo.findAll();

          var list =  products
                  .stream()
                  .map(dto -> mapper.toDTO(dto))
                  .collect(Collectors.toList());

        return list;

    }

    public ProductDTO findProductById(Long id){

        Product product = productRepo.getById(id);

        return mapper.toDTO(product);

    }

    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }

    


}
