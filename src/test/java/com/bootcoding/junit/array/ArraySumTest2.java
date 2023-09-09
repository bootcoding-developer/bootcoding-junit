package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest2 {

    @Test
    public void test(){
        ArraySum arraySum = new ArraySum();
        int[] nums = {1, 2, 3, 4, 5};
        int actualSum = arraySum.getSum(nums);
        int expectedSum = 15;
        assertEquals(expectedSum, actualSum);

    }

    @Test
    public void testNegativeElement(){
        ArraySum arraySum = new ArraySum();
        int[] nums = {-1, -2, -3, -4, -5};
        int actualSum = arraySum.getSum(nums);
        // Verify
        int expectedSum = -15;
        // Assertion
        assertEquals(expectedSum, actualSum);
    }
}