package com.testing.October26;
//https://edabit.com/challenge/9D39q2q9yAFCDM9da
/*
You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54"). Create a function that takes the video length and return it in seconds.

Examples
minutesToSeconds("01:00") ➞ 60

minutesToSeconds("13:56") ➞ 836

minutesToSeconds("10:60") ➞ -1
Notes
The video length is given as a string.
If the number of seconds is 60 or over, return -1 (see example #3).
You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid).
*/

public class VideoLength {
    public static int Alg3(String time) {
        String[] myArray = time.split(":");
        int[] newArray = new int[2];
        int seconds;

        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = Integer.parseInt(myArray[i]);
        }
        if (newArray[1] >= 60) {
            System.out.println("-1");
            return -1;
        } else {
            seconds = (newArray[0] * 60) + newArray[1];
        }

        System.out.println(seconds);
        return seconds;
    }

}
