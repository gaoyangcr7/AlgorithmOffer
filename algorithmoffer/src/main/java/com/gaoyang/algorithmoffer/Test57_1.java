package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/07/09.
 * 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，是的他们的和正好是s。
 * 如果有多对数字的和等于s，输出任意一对即可
 */
public class Test57_1 {
    private static boolean find(int arr[], int s) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] > s) {
                right--;
            } else if (arr[left] + arr[right] < s) {
                left++;
            } else {
                System.out.println("arr.left = " + arr[left] + ", arr.right = " + arr[right]);
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 11, 15};
        int s = 30;
        System.out.println(find(arr, s));
    }
}
