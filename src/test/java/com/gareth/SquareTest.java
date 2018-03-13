package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Square sq;

    @Before
    public void setUp() throws Exception {

        sq = new Square(10);
    }

    @Test
    public void getSizeOfSquare() {

        assertEquals(10, sq.getSizeOfSquare());
    }

    @Test
    public void calcArea() {

        assertEquals(100, sq.calcArea());
    }
}