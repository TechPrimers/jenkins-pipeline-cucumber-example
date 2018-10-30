package com.techprimers.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    public FizzBuzz fB;

    @Before
    public void setUp() {
        fB = new FizzBuzz();
    }

    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        Assert.assertEquals(fizzBuzz, "1");
    }

    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assert.assertEquals(fizzBuzz, "Fizz");
    }

    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        Assert.assertEquals(fizzBuzz, "Buzz");
    }

    @After
    public void tearDown() {
        fB = null;
    }

}