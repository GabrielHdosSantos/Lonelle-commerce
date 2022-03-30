package br.com.store.lonelle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AdminDTO {

    private String name;

    private String username;

    private String password;

    private boolean isEnable;

}
