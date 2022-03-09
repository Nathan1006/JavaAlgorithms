package com.testing.HackerRank.Others;

import java.util.List;

public class JumpOnCloudsOriginal {
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;



        return jumps;
    }

    public static void main(String[] args) {

        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)));

    }
//                           //old code - 3/9 test cases
//        int jumps = 0;
//        int numOfZeros = 0;
//
//        System.out.println(c);
//
//        for (int i = 0; i < c.size(); i++) {
//            numOfZeros++;
//            switch (c.get(i)) {
//                case 0:
//                    if (numOfZeros == 3) {
//                        numOfZeros = 0;
//                        jumps++;
//                    }
//                case 1:
//                    if (numOfZeros == 2) {
//                        jumps++;
//                    }
//                    i++;
//                    jumps++;
//                    numOfZeros = 0;
//            }
//        }
//
//        return jumps;
}
