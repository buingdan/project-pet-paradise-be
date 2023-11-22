package com.example.projectpetparadisebe.payload.material;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListMaterialIdDTO {
    List<Integer> listMaterialId;
}
