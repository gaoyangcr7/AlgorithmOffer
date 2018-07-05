package com.gaoyang.sort;

import com.gaoyang.algorithmoffer.Utils;

/**
 * Created by gaoyang on 2018/06/29.
 */
public class QuickSort {

    private static void quickSort(int[] arr, int left, int right) {

        if (arr == null || left > right) {
            return;
        }

        int key = arr[left];
        int partition = partitionIt(arr, left, right, key);
        quickSort(arr, left, partition - 1);
        quickSort(arr, partition + 1, right);
    }

    private static int partitionIt(int[] arr, int left, int right, int key) {
        System.out.println("key = " + key);
        int initLeft = left;
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }

            while (i < j && arr[i] <= key) {
                i++;
            }

            if (i > j) {
                break;
            }

            Utils.swap(arr, i, j);

        }

        Utils.swap(arr, i, initLeft);

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 6, 1, 2, 7, 4};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
