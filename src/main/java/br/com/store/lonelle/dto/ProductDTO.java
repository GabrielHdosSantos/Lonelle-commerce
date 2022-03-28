package br.com.store.lonelle.dto;

import br.com.store.lonelle.model.Product;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Builder
public class ProductDTO {

    private Long id;

    private String name;

    private BigDecimal price;

    private String description;

    private String imageUrl;


}
