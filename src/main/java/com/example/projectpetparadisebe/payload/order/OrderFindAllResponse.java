package com.example.projectpetparadisebe.payload.order;

import com.example.projectpetparadisebe.payload.account.AccountDTOs;
import com.example.projectpetparadisebe.payload.address.AddressResponse;
import com.example.projectpetparadisebe.payload.detailOrder.DetailOrderPayLoad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderFindAllResponse {
    private Integer id;
    private Integer status;
    private LocalDateTime createDate;
    private AccountDTOs account;
    private String fullName;
    private String phoneNumber;
    private Double amountPrice;
    private Double salePrice;
    private Double totalPrice;
    private AddressResponse address;
    private String addressDetail;
    private String orderCode;
    private List<DetailOrderPayLoad> detailOrders;


}
