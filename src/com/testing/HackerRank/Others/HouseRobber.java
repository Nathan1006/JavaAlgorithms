package com.testing.HackerRank.Others;

public class HouseRobber {
    public static int solution(int[] nums) {

        int money = 0;

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }



        return money;
    }

    public static void main(String[] args) {

        int[] nums = new int[] {1, 3, 1, 3, 100};
        System.out.println(solution(nums));

    }
}

