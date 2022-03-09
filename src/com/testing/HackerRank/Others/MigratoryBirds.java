package com.testing.HackerRank.Others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> birdCounts = new HashMap<>();
        int mostSeenBird = 0;
        System.out.println(arr);

        for (Integer integer : arr) {
            if (birdCounts.containsKey(integer)) {
                birdCounts.put(integer, birdCounts.get(integer) + 1);
            } else {
                birdCounts.put(integer, 1);
            }
        }
        for (Integer value : birdCounts.keySet()) {
            if (birdCounts.get(value) > mostSeenBird) {
                mostSeenBird = birdCounts.get(value);
            }
        }
        for (Integer Key : birdCounts.keySet()) {
            if (mostSeenBird == birdCounts.get(Key)) {
                return Key;
            }
        }

        return mostSeenBird;
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        System.out.println(migratoryBirds(arr));
    }
}
