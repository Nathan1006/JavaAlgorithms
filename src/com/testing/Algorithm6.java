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
        int counter = 0;
        String letter = "";

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(letter)){
                counter++;
            }
            letter = myArray[i];
        }

        if (counter == 1){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
