package com.testing.HackerRank.Others;

import java.util.ArrayList;
import java.util.List;

public class ClimbingLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> newRanks = new ArrayList<>();

        for (Integer score : player) {
            int rank = 1;
            for (int i = 1; i < ranked.size(); i++) {
                if (score < ranked.get(ranked.size() - 1)) {
                    rank = ranked.size() - 1;
                    break;
                } else if (score < ranked.get(i - 1) && score > ranked.get(i)) {
                    rank = i - 1;
                    break;
                } else if (score < ranked.get(i)) {
                    rank = i + 1;
                } else if (score.equals(ranked.get(i))) {
                    rank = i;
                    break;
                }

            }
            newRanks.add(rank);
        }

        return newRanks;
    }

    public static void main(String[] args) {

        List<Integer> ranked = List.of(100, 100, 50, 40, 40, 20,10);
        List<Integer> player = List.of(5, 25, 50, 120);

        System.out.println(climbingLeaderboard(ranked, player));

    }
}
