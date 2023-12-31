package com.example.projectpetparadisebe.payload.detailOrder;

import java.time.LocalDateTime;

public interface DetailOrderAdmin {
    Integer getId();

    Integer getQuantity();

    Double getTotalPrice();

    Integer getDetailProductId();

    Boolean getIsActive();

    LocalDateTime getCreateDate();
}
