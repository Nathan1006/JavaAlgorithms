package com.testing;
//https://edabit.com/challenge/EaWY5d2pYBckrkAnS
/*
Create a function that takes a word and returns true if the word has two consecutive identical letters.

Examples
doubleLetters("loop") ➞ true

doubleLetters("yummy") ➞ true

doubleLetters("orange") ➞ false

doubleLetters("munchkin") ➞ false
*/
public class Algorithm6 {
    public static boolean Alg6 (String word) {
        String[] myArray = word.split("");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == myArray[i + 1]){
                return true;
            }
        }

        //String myString = String.join("", myArray);
        System.out.println();
        return false;
    }
}
