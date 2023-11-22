package com.example.projectpetparadisebe.payload.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPayBackResponse {
    private Integer quantity;
    private Double totalPrice;

}
