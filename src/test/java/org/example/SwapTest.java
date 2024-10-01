package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {
    @Test
    void swap() {
        //given
        Swap swap = new Swap();
        int[] intArray = {1,2,3,4};
        int[] intArray2 = {1,2,3,4};

        //when
        swap.swap(intArray, 1, 2);
        swap.swap(intArray2, 1, 5);

        //then
        assertArrayEquals(new int[]{1,3,2,4}, intArray);
        assertArrayEquals(new int[]{1,2,3,4}, intArray2);

    }

}