package com.pwittchen.lombok.sample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ToStringSampleTest extends TestCase {

    @Test
    public void testShouldReturnCorrectValueWhenToStringMethodIsCalled() {
        // given
        ToStringSample toStringSample = new ToStringSample(1, "sampleName", "sample@mail.com", 2l);
        String expectedValueReturnedByToStringMethod = "ToStringSample(name=sampleName, email=sample@mail.com, number=2)";

        // when
        String returnedValue = toStringSample.toString();

        // then
        assertThat(returnedValue).isEqualTo(expectedValueReturnedByToStringMethod);
    }

}