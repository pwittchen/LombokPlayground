package com.pwittchen.lombok.boilerplate;

import lombok.Value;

import java.util.List;

@Value
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
