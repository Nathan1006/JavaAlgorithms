package com.testing.HackerRank.Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
    public static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int cloudsleft = 0;
        System.out.println(Arrays.toString(c));

        do {
            cloudsleft += k;
            cloudsleft = cloudsleft % c.length;

            if (c[cloudsleft] == 1) {
                energy -= 3;
            } else {
                energy--;
            }

        } while (cloudsleft != 0);

        return energy;

//        //stated with wrong algorithm
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

    public static void main(String[] args) {

        int[] c = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(jumpingOnClouds(c,1));

        //System.out.println(jumpingOnClouds(Arrays.asList(0,0,1,0,0,0,0,1,0,0)));

    }
}
