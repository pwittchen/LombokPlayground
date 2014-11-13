package com.pwittchen.lombok.sample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class BuilderSampleTest extends TestCase {

    @Test
    public void testBuilderShouldBuildTheObject() {
        // given
        String name = "sampleName";
        int number = 42;

        // when
        BuilderSample sampleObject = BuilderSample.builder().name(name).number(number).build();

        // then
        assertThat(sampleObject.getName()).isEqualTo(name);
        assertThat(sampleObject.getNumber()).isEqualTo(number);
    }

}