package com.gaoyang.sort;

import com.gaoyang.Utils;

public class SelectSort {

    private static void sort(int arrList[]) {

        int min = 0;
        for (int i = arrList.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrList[min] > arrList[j]) {
                    min = j;
                    break;
                }
            }
            Utils.swap(arrList, min, i);
        }
    }

    public static void main(String[] args) {
        int arrList[] = {4, 8, 1, 3, 5, 0, 8, 4, 7, 2, 6, 9};

        sort(arrList);

        Utils.printArr(arrList);
    }
}
