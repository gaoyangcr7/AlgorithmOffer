package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/06.
 * 第一版第3题
 */
//二维数组中查找
public class Test04 {

    /**
     * 1, 2, 8, 9
     * 2, 4, 9, 12
     * 4, 7, 10,13
     * 6, 8, 11,15
     * @param nums
     * @param target
     * @return
     */
    private static boolean find(int[][] nums, int target) {

        if (nums == null){
            return false;
        }
        int row = 0;
        int column = nums[0].length-1;

        while (row < nums.length && column >= 0) {
            if (nums[row][column] > target) {
                column--;
            } else if (nums[row][column] < target) {
                row++;
            } else {
                System.out.println("Bingo! "+nums[row][column]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};


        System.out.println("result = "+find(nums, 7));
    }
}
