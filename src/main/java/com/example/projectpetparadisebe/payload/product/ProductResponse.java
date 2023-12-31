package com.example.projectpetparadisebe.payload.product;

import com.example.projectpetparadisebe.entities.Category;
import com.example.projectpetparadisebe.entities.Material;
import com.example.projectpetparadisebe.entities.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Integer id;
    private String productName;
    private String description;
    private Boolean isDelete;
    private String image;
    private Double voteAverage;
    private LocalDateTime createDate;
    private Category category;
    private List<Tag> tagList;
    private List<Material> materialList;
    private Boolean isActive;
    private Boolean isComplete;
}
