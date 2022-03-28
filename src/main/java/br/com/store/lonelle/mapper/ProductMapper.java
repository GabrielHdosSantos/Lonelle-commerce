package br.com.store.lonelle.mapper;

import br.com.store.lonelle.dto.ProductDTO;
import br.com.store.lonelle.model.Product;

public class ProductMapper {

    public Product toProduct(ProductDTO productDTO){

        var toObject =  Product
                .builder()
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .description(productDTO.getDescription())
                .imageUrl(productDTO.getImageUrl())
                .build();

        return toObject;

    }

    public ProductDTO toDTO(Product product){

        var toDto =  ProductDTO.builder()
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .imageUrl(product.getImageUrl()).build();

        return toDto;
    }


}
