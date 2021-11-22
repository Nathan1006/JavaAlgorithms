package com.testing.November22;
//https://edabit.com/challenge/z9ofdqhTYi9tdCj5T
/*
Create a function that will return an integer number corresponding to the amount of digits in the given integer num.

Examples
numOfDigits(1000) ➞ 4

numOfDigits(12) ➞ 2

numOfDigits(1305981031) ➞ 10

numOfDigits(0) ➞ 1
Notes
Try to solve this challenge without using strings!
*/
public class HowManyDigits {
    private static int num;

    public static int numOfDigits(int num) {
        int digits = 0;

        while (num > 0){
            digits++;
            num /= 10;
        }

        //System.out.println(digits);

        return digits;
    }
}
