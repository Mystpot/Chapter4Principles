package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WhaleTest {

    Whale whale;

    @Before
    public void setUp() throws Exception {

        whale = new Whale("Blue", 200);
    }

    @Test
    public void getSpecies() {

        assertEquals("Blue", whale.getSpecies());
    }

    @Test
    public void getWeight() {

        assertEquals(200, whale.getWeight());
    }

    @Test
    public void swim() {

        assertEquals("I can swim!", whale.swim());
    }
}