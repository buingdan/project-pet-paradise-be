package com.example.projectpetparadisebe.payload.detailProduct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListDetailProductIdDTO {
    List<Integer> listDetailProductId;
}
