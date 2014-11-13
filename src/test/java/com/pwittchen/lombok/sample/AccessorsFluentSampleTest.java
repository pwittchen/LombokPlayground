package com.pwittchen.lombok.sample;

import junit.framework.TestCase;

import static org.fest.assertions.Assertions.assertThat;

public class AccessorsFluentSampleTest extends TestCase {

    public void testShouldCheckValuesSetByFluentAccessors() {
        // given
        AccessorsFluentSample sample = new AccessorsFluentSample();
        String name = "sampleName";
        int number = 42;

        // when
        sample.name(name).number(number);

        // then
        assertThat(sample.name()).isEqualTo(name);
        assertThat(sample.number()).isEqualTo(number);
    }

}