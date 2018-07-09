package com.gaoyang.algorithmoffer;


/**
 * Created by gaoyang on 2018/07/09.
 * 和为2的连续正数序列
 * 输入一个正数s，打印出所有和为s的连续正数序列（只少含有两个数）
 * 例如，输入15，由于1+2+3+4+5=4+5+6=7+8=15，所以打印出3个连续序列1~5、4~6和7~8
 */
public class Test57_2 {

    private static void find(int arr[], int key) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int small = 0;
        int big = 1;
        int stopLine = (key + 1) / 2;


        int sum = 0;
        while (small < stopLine) {
            for (int i = small; i <= big; i++) {
                sum += arr[i];
            }
            if (sum > key) {
                small++;
            } else if (sum < key) {
                big++;
            } else {
                System.out.println("from " + small + " to " + big);
                big++;
            }
            sum = 0;

        }
    }

    private static void find2(int arr[], int sum) {
        if (sum < 3) return;
        int small = 1;
        int big = 2;
        int middle = (sum + 1) / 2;
        int curSum = small + big;

        while (small < middle) {
            if (curSum == sum) {
                System.out.println("from " + small + " to " + big);
            }

            while (curSum > sum && small < middle) {
                curSum -= small;
                small++;
                if (curSum == sum) {
                    System.out.println("from " + small + " to " + big);
                }
            }

            big++;
            curSum += big;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        find(arr, 15);
    }
}
