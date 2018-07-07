package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/07/05.
 * 第一版第34题
 * 丑数
 * 只包含因子2、3、5的数叫丑数
 */
public class Test49 {

    private static boolean isUgly(int number) {
        System.out.println("isUngly " + number);
        if (number < 1) return false;
        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        while (number % 5 == 0) {
            number /= 5;
        }

        System.out.println(number + "is ugly number ? " + (number == 1));

        return number == 1;
    }

    //笨办法，占用时间
    private static int getUglyNumber(int index) {
        if (index <= 0) return 0;

        int count = 0;

        for (int i = 0; i < index; i++) {
            if (isUgly(i)) {
                count++;
            }
        }

        return count;
    }

    //控件换时间TODO
    private static int getUglyNumber2(int index) {
        if (index < 0)
            return 0;
        int[] uglyArray = new int[index];
        uglyArray[0] = 1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        for (int i = 1; i < index; i++) {
            int min = min(uglyArray[multiply2] * 2, uglyArray[multiply3] * 3, uglyArray[multiply5] * 5);
            uglyArray[i] = min;
            while (uglyArray[multiply2] * 2 == uglyArray[i])
                multiply2++;
            while (uglyArray[multiply3] * 3 == uglyArray[i])
                multiply3++;
            while (uglyArray[multiply5] * 5 == uglyArray[i])
                multiply5++;
        }
        return uglyArray[index - 1];

    }

    public static int min(int number1, int number2, int number3) {
        int min = (number1 < number2) ? number1 : number2;
        return min < number3 ? min : number3;
    }

    public static void main(String[] args) {
        System.out.println("##");
        System.out.println(getUglyNumber2(10));
        System.out.println("$$");
    }

}
