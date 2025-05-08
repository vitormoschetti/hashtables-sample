package br.com.twosumproblem.solutions;

import java.util.HashMap;

public class HashTableSolution {

    private HashTableSolution() {}

    public static int[] twoSum(int[] nums, int target) {

        final var map = new HashMap<Integer, Integer>();

        for (int x = 0; x < nums.length; x++) {

            int num = nums[x];
            int complement = target - num;

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), x};
            }

            map.put(num, x);

        }

        return new int[] {-1, -1};

    }

}
