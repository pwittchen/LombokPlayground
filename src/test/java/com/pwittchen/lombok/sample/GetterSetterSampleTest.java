package com.pwittchen.lombok.sample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class GetterSetterSampleTest extends TestCase {

    @Test
    public void testShouldReadSetName() {
        // given
        GetterSetterSample sample = new GetterSetterSample();
        String name = "sampleName";
        sample.setName(name);

        // when
        String returnedName = sample.getName();

        // then
        assertThat(returnedName).isEqualTo(name);
    }
}