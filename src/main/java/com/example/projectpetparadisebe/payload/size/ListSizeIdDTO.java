package com.example.projectpetparadisebe.payload.size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListSizeIdDTO {
    List<Integer> listSizeId;
}
