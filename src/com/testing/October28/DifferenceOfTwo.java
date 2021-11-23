package com.testing.October28;
//https://edabit.com/challenge/hymPkXdhmDQLe87QT
/*
Create a function that takes an array and returns the difference between the biggest and smallest numbers.

Examples
differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.
*/

public class DifferenceOfTwo {
    public static int Alg4(int[] arr) {
        int difference = 0;
        int max = 0;
        int min = 10000;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        difference = max - min;

        System.out.println(difference);
        return difference;
    }
}
