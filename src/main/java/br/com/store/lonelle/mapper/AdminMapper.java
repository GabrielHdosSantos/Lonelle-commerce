package br.com.store.lonelle.mapper;

import br.com.store.lonelle.dto.AdminDTO;
import br.com.store.lonelle.model.Admin;
import org.springframework.stereotype.Component;

@Component
public class AdminMapper {

    public Admin toAdmin(AdminDTO adminDTO){

        var admin = Admin.builder()
                .name(adminDTO.getName())
                .isEnable(adminDTO.isEnable())
                .username(adminDTO.getUsername())
                .password(adminDTO.getPassword())
                .build();

        return admin;

    }


    public AdminDTO toDto(Admin admin){

        var dto = AdminDTO.builder()
                .name(admin.getName())
                .isEnable(admin.isEnable())
                .username(admin.getUsername())
                .password(admin.getPassword())
                .build();

        return dto;

    }

}
