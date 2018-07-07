package com.gaoyang.algorithmoffer;

import java.util.Random;

/**
 * Created by gaoyang on 2018/06/07.
 */
public class Test09_1 {

    private static void sortAge(int ages[]) {
        if (ages == null) {
            return;
        }

        int oldest = 99;
        int timesOfAge[] = new int[oldest + 1];
        for (int i = 0; i < oldest + 1; i++) {
            timesOfAge[i] = 0;
        }

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            timesOfAge[age]++;
        }

        int index = 0;
        for (int i = 0; i < oldest + 1; i++) {
            for (int j = 0; j < timesOfAge[i]; j++) {
                ages[index] = i;
                index++;
            }
        }

        for (int i : ages) {
            System.out.printf(i + ", ");
        }
    }

    public static void main(String[] args) {

        int ages[] = new int[200];
        Random random = new Random(99);
        for (int i = 0; i < 200; i++) {
            ages[i] = random.nextInt(99)+1;
            System.out.printf(ages[i] + ", ");
        }
        System.out.println();
        sortAge(ages);
    }
}
