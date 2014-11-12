package com.pwittchen.lombok.sample;

import lombok.ToString;
import lombok.Value;

@Value
@ToString(exclude = "id")
public class ToStringSample {
    private int id;
    private String name;
    private String email;
    private long number;
}
