package com.testing.HackerRank.ThirtyDaysofCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int largestCount = 0;

        for (char num : binary.toCharArray()) {
            count++;
            if (num == '0') {
                count = 0;
            } else if (count > largestCount) {
                largestCount = count;
            }
        }

        System.out.println(largestCount);

        bufferedReader.close();
    }
}

