package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    Fish fish;

    @Before
    public void setUp() throws Exception {

        fish = new Fish(10, "Tuna");

    }

    @Test
    public void getWeight() {

        assertEquals(10, fish.getWeight());
    }

    @Test
    public void getSpecies() {

        assertEquals("Tuna", fish.getSpecies());
    }

    @Test
    public void swim() {

        assertEquals("I am swimming!", fish.swim());
    }

    @Test
    public void walk() {

        assertEquals(null, fish.walk());
    }
}