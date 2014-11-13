package com.pwittchen.lombok.sample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class EqualsAndHashcodeSampleTest extends TestCase {

    @Test
    public void testShouldCheckIfTwoInstancesOfObjectAreEqual() {
        // given
        String name = "sampleName";
        int score = 1;
        String[] tags = new String[]{"tag1", "tag2"};
        int id = 2;

        // when
        EqualsAndHashcodeSample instanceOne = new EqualsAndHashcodeSample(name, score, tags, id);
        EqualsAndHashcodeSample instanceTwo = new EqualsAndHashcodeSample(name, score, tags, id);
        boolean comparison = instanceOne.equals(instanceTwo);

        // then
        assertThat(comparison).isTrue();
    }

    @Test
    public void testShouldCheckIfTwoEqualObjectHaveTheSameHashcode() {
        // given
        String name = "sampleName";
        int score = 1;
        String[] tags = new String[]{"tag1", "tag2"};
        int id = 2;

        // when
        EqualsAndHashcodeSample instanceOne = new EqualsAndHashcodeSample(name, score, tags, id);
        EqualsAndHashcodeSample instanceTwo = new EqualsAndHashcodeSample(name, score, tags, id);

        // then
        assertThat(instanceOne.hashCode()).isEqualTo(instanceTwo.hashCode());
    }

    @Test
    public void testShouldCheckIfTwoDifferentObjectsAreNotEqual() {
        // given
        int score = 1;
        String[] tags = new String[]{"tag1", "tag2"};

        // when
        EqualsAndHashcodeSample instanceOne = new EqualsAndHashcodeSample("sampleName1", score, tags, 1);
        EqualsAndHashcodeSample instanceTwo = new EqualsAndHashcodeSample("sampleName2", score, tags, 2);

        // then
        assertThat(instanceOne.hashCode()).isNotEqualTo(instanceTwo.hashCode());
    }

}