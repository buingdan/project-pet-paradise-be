package com.example.projectpetparadisebe.payload.productWebsiteDTO;

import com.example.projectpetparadisebe.entities.Color;
import com.example.projectpetparadisebe.entities.Material;
import com.example.projectpetparadisebe.entities.Size;
import com.example.projectpetparadisebe.entities.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionalProduct {
    private Set<Tag> tagList;
    private Set<Material> materialList;
    private Set<Color> colorList;
    private Set<Size> sizeList;

}
