package com.testing;
//https://edabit.com/challenge/WM5s7vuHnXdcKCEjS
/*
Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).

Sort integer array in ascending order.
If the function's argument is null, an empty array, or undefined; return an empty array.
Return a new array of sorted numbers.
Examples
sortNumsAscending([1, 2, 10, 50, 5]) ➞ [1, 2, 5, 10, 50]

sortNumsAscending([80, 29, 4, -95, -24, 85]) ➞ [-95, -24, 4, 29, 80, 85]

sortNumsAscending(null) ➞ []

sortNumsAscending([]) ➞ []
Notes
Test input can be positive or negative.
*/


import java.lang.reflect.Array;
import java.util.Arrays;

public class Algorithm5 {
    public static int[] Alg5 (int[] nums) {
        int[] myArray = new int[nums.length];
        int myNum = nums[0];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                myNum = nums[j];
                if (nums[j] < myNum) {
                    //myNum = nums
                }
            }
            myArray[i] = nums[i];
        }

        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}
