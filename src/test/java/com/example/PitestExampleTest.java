package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PitestExampleTest {
    private PitestExample pitestExample = new PitestExample(42);

    @Test
    public void testPitest() {
        assertEquals(42, pitestExample.higherOrVariable(2,5));
    }
}
