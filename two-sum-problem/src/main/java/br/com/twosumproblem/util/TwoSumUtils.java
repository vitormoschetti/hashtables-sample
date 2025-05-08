package br.com.twosumproblem.util;

import java.util.Random;

public class TwoSumUtils {

    private TwoSumUtils() {}

    private static final Random RANDOM = new Random();

    /**
     * Gera um array de inteiros aleatórios.
     *
     * @param size    Quantidade de elementos no array.
     * @param minValue  Valor mínimo (inclusivo) de cada elemento.
     * @param maxValue  Valor máximo (inclusivo) de cada elemento.
     * @return        Array de tamanho 'size' com valores aleatórios em [minVal, maxVal].
     */
    public static int[] generateRandomArray(int size, int minValue, int maxValue) {

        int[] result = new int[size];

        int bound = maxValue - minValue + 1;

        for (int i = 0; i < size; i++) {
            result[i] = RANDOM.nextInt(bound) + minValue;
        }

        return result;

    }

    /**
     * Gera um target para o Two-Sum que garante solução.
     * Escolhe dois índices distintos aleatoriamente e retorna a soma dos valores.
     *
     * @param nums  Array de inteiros previamente gerado.
     * @return      Soma de dois elementos distintos de 'nums'.
     */
    public static int generateRandomTarget(int[] nums) {

        final var x = RANDOM.nextInt(nums.length);
        int y;

        do {
            y = RANDOM.nextInt(nums.length);
        } while (y == x);

        return nums[x] + nums[y];

    }



}
