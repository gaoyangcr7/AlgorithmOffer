package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/07.
 */
//旋转数组的最小数字
//TODO
public class Test08 {

    private static int findSmallest(int nums[], int left, int right) {
        int smallestNum = -1;

        int length = nums.length;
        int midIndex = length / 2;
        int mid = nums[midIndex];
        if (nums[left] > nums[mid-1]) {
            return findSmallest(nums, left, mid-1);
        }

        if (nums[mid] > nums[right]) {
            return  findSmallest(nums, mid, right);
        }


        return smallestNum;
    }

    public static void main(String[] args) {

        int nums[] = {3, 4, 5, 1, 2};

//        System.out.println(findSmallest(nums, 0, nums.length-1));

    }
}
