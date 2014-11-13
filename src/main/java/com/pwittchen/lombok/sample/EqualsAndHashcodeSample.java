package com.pwittchen.lombok.sample;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(exclude = {"score","tags"})
public class EqualsAndHashcodeSample {
    private String name;
    private double score;
    private String[] tags;
    private int id;
}
