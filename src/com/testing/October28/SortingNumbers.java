package com.testing.October28;
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

public class SortingNumbers {
    public static int[] Alg5 (int[] nums) {
        int[] myArray = new int[nums.length];
        int number = nums[0];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < number) {
                    number = nums[j];
                }
            }
            myArray[i] = number;
        }

        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}
