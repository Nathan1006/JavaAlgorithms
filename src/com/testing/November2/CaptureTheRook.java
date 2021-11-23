package com.testing.November2;
//https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
/*
Write a function that returns true if two rooks can attack each other, and false otherwise.

Examples
canCapture(["A8", "E8"]) ➞ true

canCapture(["A1", "B2"]) ➞ false

canCapture(["H4", "H3"]) ➞ true

canCapture(["F5", "C8"]) ➞ false
Notes
Assume no blocking pieces.
Two rooks can attack each other if they share the same row (letter) or column (number).
*/
public class CaptureTheRook {
    public static boolean Alg9(String[] rooks) {
        String rook1 = rooks[0];
        String rook2 = rooks[1];
        String[] location1 = rook1.split("");
        String[] location2 = rook2.split("");

        if (location1[0].equals(location2[0]) || location1[1].equals(location2[1])){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
