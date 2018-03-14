package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogTest {

    Frog frog;

    @Before
    public void setUp() throws Exception {

        frog = new Frog("Red", 15);

    }

    @Test
    public void getSpecies() {

        assertEquals("Red", frog.getSpecies());

    }

    @Test
    public void getWeight() {

        assertEquals(15, frog.getWeight());
    }

    @Test
    public void walk() {

        assertEquals("I can walk!", frog.walk());
    }

    @Test
    public void swim() {

        assertEquals("I can also swim!", frog.swim());
    }
}