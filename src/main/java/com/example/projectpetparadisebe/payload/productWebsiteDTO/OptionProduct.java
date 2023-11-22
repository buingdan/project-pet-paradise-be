package com.example.projectpetparadisebe.payload.productWebsiteDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionProduct {
    private String optionName;
    private List<ValueOption> values_options;
}
