package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrimTest {

    @Test
    void trim() {
        //given
        Trim trim = new Trim();

        //when
        String result1 = trim.trimma("hello!     ");
        String result2 = trim.trimma("  x  ");

        //then
        assertEquals("hello!", result1);
        assertEquals("x", result2);
    }

}