package com.testing.HackerRank.Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ClimbingLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> newRanks = new ArrayList<>();
        List<Integer> leaderboard = new ArrayList<>();

        for (int i = 0; i < ranked.size() - 1; i++) {
            if (ranked.get(i) != ranked.get(i+1)) {
                leaderboard.add(ranked.get(i));
            }
        }
        leaderboard.add(ranked.get(ranked.size()-1));
        Collections.sort(leaderboard);

        int rank = leaderboard.size();

        for (Integer score : player) {
            for (int i = leaderboard.size() - rank; i > 1;) {
                if (score.equals(leaderboard.get(i)) || score < leaderboard.get(i)) {
                    rank--;
                } else {
                    rank--;
                    break;
                }
            }

            newRanks.add(rank);
        }

        return newRanks;
    }

    public static void main(String[] args) {

        List<Integer> ranked = List.of(100, 100, 50, 40, 40, 20, 10);
        List<Integer> player = List.of(5, 25, 50, 120);

        System.out.println(climbingLeaderboard(ranked, player));

    }
}
