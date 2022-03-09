package com.testing.HackerRank.Others;

import java.util.ArrayList;
import java.util.List;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int numOfApples = 0 , numOfOranges = 0;

        for (Integer apple : apples) {
            if (apple + a >= s && apple + a <= t) {
                numOfApples++;
            }
        }
        for (Integer orange : oranges) {
            if (orange + b >= s && orange + b <= t) {
                numOfOranges++;
            }
        }

        System.out.println(numOfApples);
        System.out.println(numOfOranges);
    }

    public static void main(String[] args) {

        List<Integer> apples = List.of(2, 3, -4);
        List<Integer> oranges = List.of(3, -2, -4);

        countApplesAndOranges(7, 10, 4, 12, apples, oranges);
    }
}
