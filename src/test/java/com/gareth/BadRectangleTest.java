package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BadRectangleTest {

    BadRectangle br;

    @Before
    public void setUp() throws Exception {

        br = new BadRectangle(5, 5);
    }

    @Test
    public void calcArea() {

        assertEquals(25, br.calcArea());
    }
}