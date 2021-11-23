package com.testing.October26;
//https://edabit.com/challenge/tiyPFonvAJ8e6H9jS

/*
Create a function that takes an integer n and reverses it.

Examples
rev(5121) ➞ "1215"

rev(69) ➞ "96"

rev(-122157) ➞ "751221"
Notes
This challenge is about using two operators that are related to division.
If the number is negative, treat it like it's positive.
*/

import java.util.Arrays;

public class ReverseTheNumber {

    public static String Alg2(int n) {
        String myNum = String.valueOf(Math.abs(n));
        String[] myArray = myNum.split("");
        String[] newArray = new String[myArray.length];
        int counter = myArray.length;

        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[counter - 1];
            counter--;
        }
        String myString = String.join("", newArray);

        System.out.println(myString);
        return myNum;
    }

}
