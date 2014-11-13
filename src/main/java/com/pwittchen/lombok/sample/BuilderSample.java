package com.pwittchen.lombok.sample;

import lombok.Value;
import lombok.experimental.Builder;

@Builder
@Value
public class BuilderSample {
    String name;
    int number;
}
