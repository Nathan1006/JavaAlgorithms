package com.testing.November9;
// https://edabit.com/challenge/9X8zLpBEcQsyerPgL
/*
Create a function that takes a number as an argument and returns the highest digit in that number.

Examples
highestDigit(4666) ➞ 6

highestDigit(544) ➞ 5

highestDigit(379) ➞ 9

highestDigit(2) ➞ 2

highestDigit(377401) ➞ 7
Notes
Don't forget to return the result.
*/

public class LargestDigit {
    public static int Alg12(int n) {
        int largestDigit = 0;
        String number = Integer.toString(n);
        int[] digits = new int[number.length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = number.charAt(i) - '0';
        }

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largestDigit){
                largestDigit = digits[i];
            }
        }

        System.out.println(largestDigit);

        return largestDigit;
    }
}
