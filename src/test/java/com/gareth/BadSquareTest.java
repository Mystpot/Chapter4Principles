package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BadSquareTest {

    BadSquare bs;

    @Before
    public void setUp() throws Exception {

        bs = new BadSquare();
        bs.setBreadth(5);
        bs.setLength(5);
    }

    @Test
    public void getLength() {

        assertEquals(5, bs.getLength());
    }

    @Test
    public void getBreadth() {

        assertEquals(5, bs.getBreadth());
    }
}