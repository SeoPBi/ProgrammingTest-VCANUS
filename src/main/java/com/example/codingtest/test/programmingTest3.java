package com.example.codingtest.test;

public class programmingTest3 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }
}
