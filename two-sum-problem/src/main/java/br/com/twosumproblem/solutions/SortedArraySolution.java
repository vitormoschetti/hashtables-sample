package br.com.twosumproblem.solutions;

import java.util.Arrays;

public class SortedArraySolution {

    private SortedArraySolution() {}

    public static int[] twoSum(int[] nums, int target) {

        final var numsSorted = Arrays.stream(nums).sorted().toArray();

        for (int x = 0; x < numsSorted.length; x++) {
            
            int y = target - numsSorted[x];
            final var result = Arrays.binarySearch(numsSorted, y);

            if(result >= 0) {
                return new int[] {x, result};
            }

        }

        return new int[] {-1, -1};

    }

}
