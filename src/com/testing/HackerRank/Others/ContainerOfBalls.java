package com.testing.HackerRank.Others;

import com.testing.November9.LargestDigit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainerOfBalls {
    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here
        HashMap<Integer, Integer> numOfBalls = new HashMap<Integer, Integer>(); //total number of each type/color of ball
        List<Integer> ContainerCapacities = new ArrayList<>();

        System.out.println(container);

        for (int row = 0; row < container.size(); row++) {
            int capacity = 0;
            for (int col = 0; col < container.get(row).size(); col++) {
                int ballCount = container.get(row).get(col);
                capacity += container.get(row).get(col);
                if (numOfBalls.containsKey(col)){
                    numOfBalls.put(col, row + ballCount);
                } else {
                    numOfBalls.put(col, row);
                }
            }
            ContainerCapacities.add(capacity);
        }

        System.out.println(ContainerCapacities);
        System.out.println(numOfBalls);

        for (int i = 0; i < numOfBalls.size(); i++) {
            for (int j = 0; j < ContainerCapacities.size(); j++) {
                if (numOfBalls.get(i) < ContainerCapacities.get(j)) {
                    return "NOT POSSIBLE";
                }
            }
        }
        return "POSSIBLE";
    }

    public static void main(String[] args) {
        List<List<Integer>> Container = new ArrayList<List<Integer>>();
        List<Integer> balls = new ArrayList<Integer>();

        balls.add(1);
        balls.add(1);
        Container.add(balls); // add first list
        balls = new ArrayList<Integer>(balls); // create a new inner list that has the same content as
        // the original inner list
        balls.set(0, 2);
        balls.set(1, 0);
        Container.add(balls); // add second list

        //container.get(0).add(300); // changes only the first inner list

        System.out.println(organizingContainers(Container));
    }
}
