package com.example.projectpetparadisebe.payload.response;

import com.example.projectpetparadisebe.entities.Color;
import com.example.projectpetparadisebe.entities.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailProductDto {
    private Integer id;
    private int quantity;
    private Double priceImport;
    private Double priceExport;
    private Boolean isDelete;
    private String productImage;
    private String productName;
    private Color color;
    private Size size;
}
