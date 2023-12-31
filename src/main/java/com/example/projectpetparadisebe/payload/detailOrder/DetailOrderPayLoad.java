package com.example.projectpetparadisebe.payload.detailOrder;

import com.example.projectpetparadisebe.entities.DetailProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailOrderPayLoad {
    Integer id;
    Integer quantity;
    Double totalPrice;

    DetailProduct detailProduct;
    Boolean isActive;
    LocalDateTime createDate;
    String detailOrderCode;

}
