package com.testing;
//https://edabit.com/challenge/GjCgCugvh4eorPmgM
/*
A number is said to be Disarium if the sum of its digits raised to their respective positions is the number itself.

Create a function that determines whether a number is a Disarium or not.

Examples
isDisarium(75) ➞ false
// 7^1 + 5^2 = 7 + 25 = 32

isDisarium(135) ➞ true
// 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135

isDisarium(518) ➞ false

isDisarium(518) ➞ true

isDisarium(544) ➞ false

isDisarium(8) ➞ true

isDisarium(466) ➞ false
Notes
Position of the digit is 1-indexed.
*/

public class Algorithm10 {
    public static boolean Alg10(int n) {
        int total = 0;
        String number = Integer.toString(n);
        int[] numbas = new int[number.length()];

        for (int i = 0; i < numbas.length; i++) {
            int powerOf = i + 1;
            numbas[i] = number.charAt(i) - '0';
            total += Math.pow(numbas[i], powerOf);
        }
        System.out.println(total + " : " + n);
        if (total == n) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
