package br.com.twosumproblem;

import br.com.twosumproblem.solutions.HashTableSolution;
import br.com.twosumproblem.solutions.QuadraticTimeAlgorithm;
import br.com.twosumproblem.solutions.SortedArraySolution;
import br.com.twosumproblem.util.TwoSumUtils;

public class Main {

    public static void main(String[] args) {

        final var nums = TwoSumUtils.generateRandomArray(10_000_000, 1, Integer.MAX_VALUE);
        final var target = TwoSumUtils.generateRandomTarget(nums);

        // --------------------------------------------------------------------------------------------------------------------

        final var quadraticInit = System.currentTimeMillis();

        QuadraticTimeAlgorithm.twoSum(nums.clone(), target);

        System.out.println("Quadratic time: " + (System.currentTimeMillis() - quadraticInit) + " ms");

        // --------------------------------------------------------------------------------------------------------------------

        final var sortedArrayInit = System.currentTimeMillis();

        SortedArraySolution.twoSum(nums.clone(), target);

        System.out.println("Sorted time: " + (System.currentTimeMillis() - sortedArrayInit) + " ms");

        // --------------------------------------------------------------------------------------------------------------------

        final var hashTableInit = System.currentTimeMillis();

        HashTableSolution.twoSum(nums.clone(), target);

        System.out.println("Hash Table time: " + (System.currentTimeMillis() - hashTableInit) + " ms");


    }

}
