package com.example.projectpetparadisebe.payload.color;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColorAdminDTO {
    private Integer id;
    private String colorName;
    private Boolean isDeleted;
    private Boolean isActive;

}
