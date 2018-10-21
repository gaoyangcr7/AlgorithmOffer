package com.gaoyang.algorithmoffer;

/**
 * 第一版第9题
 */
//斐波那契数列
public class Test10 {

    private static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return result;
    }


    private static int fibonacci2(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    private static int fibonacci3(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = fib[2] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("result = " + result);

        int result2 = fibonacci2(n);
        System.out.println("result2 = " + result2);

        int result3 = fibonacci3(n);
        System.out.println("result3 = " + result3);

    }
}
