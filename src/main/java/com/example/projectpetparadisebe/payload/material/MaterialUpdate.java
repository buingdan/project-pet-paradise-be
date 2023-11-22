package com.example.projectpetparadisebe.payload.material;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialUpdate {
    private Integer id;
    private String materialName;
    private Boolean isDeleted;
    private Boolean isActive;
}
