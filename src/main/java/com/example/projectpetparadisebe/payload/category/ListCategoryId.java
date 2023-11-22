package com.example.projectpetparadisebe.payload.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListCategoryId {
    List<Integer> listCategoryId;
}
