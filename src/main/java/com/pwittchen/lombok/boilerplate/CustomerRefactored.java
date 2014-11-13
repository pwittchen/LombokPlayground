package com.pwittchen.lombok.boilerplate;

import lombok.Value;
import lombok.experimental.Builder;

import java.util.List;

@Value
@Builder
public class CustomerRefactored {
    int id;
    String name;
    String surname;
    String phone;
    String email;
    String address;
    List<String> products;

    public String getNameWithUpperCase() {
        return name.toUpperCase();
    }
}
