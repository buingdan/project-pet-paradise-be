package com.example.projectpetparadisebe.payload.category;

import com.example.projectpetparadisebe.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {
    private Integer id;

    private String categoryName;

    private Boolean isDeleted;
    private Boolean isActive;
    private Integer categoryParentId;
    private List<Category> categoryChildren;
}
