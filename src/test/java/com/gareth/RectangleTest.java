package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rec;

    @Before
    public void setUp() throws Exception {

        rec = new Rectangle(5, 10);
    }

    @Test
    public void getLength() {

        assertEquals(5, rec.getLength());
    }

    @Test
    public void getBreadth() {

        assertEquals(10, rec.getBreadth());
    }

    @Test
    public void calcArea() {

        assertEquals(50, rec.calcArea());
    }
}