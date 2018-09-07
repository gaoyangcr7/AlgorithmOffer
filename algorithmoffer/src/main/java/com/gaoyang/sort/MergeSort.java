package com.gaoyang.sort;

import com.gaoyang.Utils;

import java.util.Arrays;

public class MergeSort {

    private static void sort(int[] arrList, int left, int right) {
        if (arrList == null || arrList.length == 0) {
            return;
        }
        if (left == right) {
            return;
        }

        int midIndex = (left + right) / 2;

        sort(arrList, left, midIndex);
        sort(arrList, midIndex + 1, right);

//        merge(arrList, 0, midIndex);
//        merge(arrList, midIndex + 1, arrList.length - 1);

        merge(arrList, left, midIndex, right);
    }

    private static void merge(int arrList[], int left, int mid, int right) {
        if (arrList == null || arrList.length == 0) {
            return;
        }

        int[] tmpArr = Arrays.copyOfRange(arrList, left, right + 1);

        int leftStart = left;
        int rightStart = mid + 1;
        for (int k = left; k < right + 1; k++) {

            if (leftStart > mid) {
                arrList[k] = tmpArr[rightStart - left];
                rightStart++;
            } else if (rightStart > right) {
                arrList[k] = tmpArr[leftStart - left];
                leftStart++;
            } else if (tmpArr[leftStart - left] < tmpArr[rightStart - left]) {
                arrList[k] = tmpArr[leftStart - left];
                leftStart++;
            } else {
                arrList[k] = tmpArr[rightStart - left];
                rightStart++;
            }
        }
    }

    public static void main(String[] args) {
        int arrList[] = {4, 8, 1, 3, 5, 0, 8, 4, 7, 2, 6, 9};
        int arrList1[] = {4, 6, 2, 1, 654, 43, 76, 90, 0, 21};
        int arrList2[] = {1, 0, 3, 4, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};

        sort(arrList, 0, arrList.length - 1);

        Utils.printArr(arrList);
    }

}
