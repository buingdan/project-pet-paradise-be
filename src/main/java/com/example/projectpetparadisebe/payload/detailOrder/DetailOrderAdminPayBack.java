package com.example.projectpetparadisebe.payload.detailOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailOrderAdminPayBack {
    private String detailOrderCode;
    private Integer quantity;


}
