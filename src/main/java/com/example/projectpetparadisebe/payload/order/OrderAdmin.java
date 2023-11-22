package com.example.projectpetparadisebe.payload.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderAdmin {
    List<OrderFindAllResponse> orders;
    private Integer totalElement;
}
