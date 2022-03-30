package br.com.store.lonelle.dto;

import br.com.store.lonelle.model.Adress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class OrderDTO {

    private List<Long> productsId;

    private BigDecimal total;


}
