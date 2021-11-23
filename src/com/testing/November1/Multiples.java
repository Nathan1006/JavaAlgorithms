package com.testing.November1;

import java.util.*;
//https://edabit.com/challenge/rzpucPyoyEtXPo2BG
/*
Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.

Examples
arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]

arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
Notes
Notice that num is also included in the returned array.
*/

public class Multiples {
    public static int[] Alg7 (int num, int length) {
        int[] myArray = new int[length];
        int currentNum = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = num + currentNum;
            currentNum += num;
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}
