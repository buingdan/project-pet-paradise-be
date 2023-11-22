package com.example.projectpetparadisebe.payload.address;

import com.example.projectpetparadisebe.entities.District;
import com.example.projectpetparadisebe.entities.Province;
import com.example.projectpetparadisebe.entities.Ward;

import java.time.LocalDateTime;


public interface AddressResponse {
    Integer getId();

    String getAddressDetail();

    Boolean getIsDeleted();

    LocalDateTime getCreateDate();

    Ward getWard();

    Boolean getIsActive();

    String getPhoneNumber();

    String getFullName();

    Boolean getIsDefault();

    Province getProvince();

    District getDistrict();
}
