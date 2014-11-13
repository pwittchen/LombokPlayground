package com.pwittchen.lombok.sample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DataSampleTest extends TestCase {

    @Test
    public void testShouldGetPreviouslySetNameValue() {
        // given
        DataSample dataSample = new DataSample();
        String name = "sampleName";
        dataSample.setName(name);

        // when
        String returnedName = dataSample.getName();

        // then
        assertThat(name).isEqualTo(returnedName);
    }

    @Test
    public void testShouldGetPreviouslySetNumberValue() {
        // given
        DataSample dataSample = new DataSample();
        int number = 41;
        dataSample.setNumber(number);

        // when
        int returnedNumber = dataSample.getNumber();

        // then
        assertThat(number).isEqualTo(returnedNumber);
    }

}