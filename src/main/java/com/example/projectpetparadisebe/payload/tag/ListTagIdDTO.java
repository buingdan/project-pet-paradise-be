package com.example.projectpetparadisebe.payload.tag;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListTagIdDTO {
    List<Integer> tagIdList;
}
