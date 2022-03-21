package com.testing.HackerRank.Others;

public class HouseRobber {
    public static int solution(int[] nums) {
        int[] money = new int[nums.length];

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        money[0] = nums[0];
        money[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            money[i] = Math.max(money[i-1], money[i-2] + nums[i]);
        }

        return money[money.length-1];

    }

    public static void main(String[] args) {

        int[] nums = new int[] {1, 3, 1, 3, 100};
        System.out.println(solution(nums));

    }
}

