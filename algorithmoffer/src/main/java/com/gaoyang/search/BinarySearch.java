package com.gaoyang.search;


/**
 * Created by gaoyang on 2018/07/06.
 * 二分查找法
 */
public class BinarySearch {

    //非递归
    private static int binSearch(int arr[], int key) {

        if (arr == null || arr.length <= 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (key > arr[mid]) {

                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    //递归
    private static int binSearch2(int arr[], int start, int end, int key) {
        if (arr == null || arr.length <= 0 || start > end) {
            return -1;
        }
        int mid = (end - start) / 2 + start;

        if (key > arr[mid]) {
            return binSearch2(arr, mid + 1, end, key);
        } else if (key < arr[mid]) {
            return binSearch2(arr, start, mid - 1, key);
        } else {
            return mid;
        }

    }

    public static void main(String[] args) {
//        int srcArray[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};

        int key = 21;
        System.out.println(binSearch(srcArray, key));
        System.out.println(binSearch2(srcArray, 0, srcArray.length - 1, key));
    }
}
