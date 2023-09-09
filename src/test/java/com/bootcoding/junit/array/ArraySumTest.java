package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    
    @Test
    public void testWithPositiveNumbers(){
        int[] nums = {1 ,2 ,3 ,4 ,5};
        int expectedSum = 15;
        ArraySum arraySum = new ArraySum();
        int actualSum = arraySum.getSum(nums);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testWithNegativeNumbers(){
        int[] nums = {-1 ,-2 ,-3 ,-4 ,-5};
        int expectedSum = -15;
        ArraySum arraySum = new ArraySum();
        int actualSum = arraySum.getSum(nums);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testWithMixedNumbers(){
        int[] nums = {1 ,-2 ,-3 ,-4 ,5};
        int expectedSum = -3;
        ArraySum arraySum = new ArraySum();
        int actualSum = arraySum.getSum(nums);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testArrayWithEquals(){
        int[] inputArray = {1, 2, 3, 4, 5};
        int expectedSum = -15;
        ArraySum arraySum = new ArraySum();
        int[] outputArray = arraySum.getEvenArray(inputArray);
        int[] expectedArray = {2, 4};
        assertArrayEquals(expectedArray, outputArray);

    }
}