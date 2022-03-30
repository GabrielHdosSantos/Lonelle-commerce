package br.com.store.lonelle.dto;

import br.com.store.lonelle.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProductDTO {

    private Long id;

    @NotEmpty(message = "The name cannot be name")
    @NotBlank(message = "The name cannot be blank")
    private String name;

    @NotNull(message = "The price cannot be null")
    @NotBlank(message = "The price cannot be blank")
    @Min(10)
    private BigDecimal price;

    @NotNull(message = "The description cannot be null")
    @NotBlank(message = "The description cannot be blank")
    private String description;

    @NotNull(message = "The imageUrl cannot be null")
    @NotBlank(message = "The imageUrl cannot be blank")
    private String imageUrl;


}
