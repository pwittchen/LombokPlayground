package com.pwittchen.lombok.sample;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GetterSetterSample {
    @Getter
    @Setter
    private String name;
    @Setter(AccessLevel.PROTECTED)
    private int number;
}
