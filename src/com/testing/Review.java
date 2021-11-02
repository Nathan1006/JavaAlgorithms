package com.testing;

public class Review {
    public static int minutesToSeconds(String tm) {
        String[] myString = tm.split(":");
        int[] newString  = new int[2];
        int seconds = 0;

        for (int i = 0; i < myString.length; i++) {
            newString[i] = Integer.parseInt(myString[i]);
        }
        if (newString[1] >= 60) {
            System.out.println(-1);
            return -1;
        } else {
            seconds = newString[1] + (newString[0] * 60);
        }
        System.out.println(seconds);
        return seconds;
    }
}
