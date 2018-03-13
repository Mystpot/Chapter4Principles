package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusTest {

    Bus bus;

    @Before
    public void setUp() throws Exception {

        bus = new Bus("Kia", 6);
    }

    @Test
    public void getModel() {

        assertEquals("Kia", bus.getModel());
    }

    @Test
    public void getNumOfWheels() {

        assertEquals(6, bus.getNumOfWheels());
    }
    
}