package com.bootcoding.junit.array;

public class ArraySum {

    public int getSum(int numbers[]){
        int sum = 0;
        for(int n: numbers){
            sum += n;
        }
        return sum;
    }

    // Get Maximum Element from given array

    // Get Even Element Array from given array
    public int[] getEvenArray(int[] nums){
        int evenCount = 0;
        for(int n : nums){
            if(n % 2 == 0){
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int i = 0;
        for(int n : nums){
            if(n % 2 == 0){
                evenArray[i++] = n;
            }
        }
        return evenArray;
    }
}