package com.pwittchen.lombok.sample;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ValueSampleTest extends TestCase {

    private String testName;
    private int testNumber;

    @Before
    public void setUp() {
        this.testName = "sampleName";
        this.testNumber = 2;
    }

    @Test
    public void testGeneratedNameGetter() {
        // given
        ValueSample valueSample = new ValueSample(testName, testNumber);

        // when
        String name = valueSample.getName();

        // then
        assertThat(name).isEqualTo(testName);
    }

    @Test
    public void testGeneratedNumberGetter() {
        // given
        ValueSample valueSample = new ValueSample(testName, testNumber);

        // when
        int number = valueSample.getNumber();

        // then
        assertThat(number).isEqualTo(testNumber);
    }

}