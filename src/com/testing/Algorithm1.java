package com.testing;
//https://edabit.com/challenge/GBKphScsmDi9ek3ra

/*
Create a function that takes a string and returns the number (count) of vowels contained within it.
Examples:

countVowels("Celebration") ➞ 5
countVowels("Palm") ➞ 1
countVowels("Prediction") ➞ 4

Notes:

a, e, i, o, u are considered vowels (not y).
All test cases are one word and only contain letters.
*/

public class Algorithm1 {

    public static int Alg1 (String str) {
        int vowelsCount = 0;
        String word = str;
        // Your code here
        String[] myArray = word.split("");

        for (int i = 0; i < myArray.length; i++) {
            switch (myArray[i]){
                case "a" :
                    vowelsCount++;
                    break;
                case "e" :
                    vowelsCount++;
                    break;
                case "i" :
                    vowelsCount++;
                    break;
                case "o" :
                    vowelsCount++;
                    break;
                case "u" :
                    vowelsCount++;
                    break;
            }
        }
        System.out.println(vowelsCount);

        return vowelsCount;
    }

}
