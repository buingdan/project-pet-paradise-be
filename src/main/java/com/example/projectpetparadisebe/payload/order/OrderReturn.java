package com.example.projectpetparadisebe.payload.order;

import com.example.projectpetparadisebe.payload.detailOrder.DetailOrderAdminPayBack;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderReturn {
    private String orderCode;
    private List<DetailOrderAdminPayBack> detailOrderAdminPayBacks;
    private Integer status;
    private String reason;
}
