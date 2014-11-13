package com.pwittchen.lombok.sample;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class AccessorsFluentSample {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int number;
}
