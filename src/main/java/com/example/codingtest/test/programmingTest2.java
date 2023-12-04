package com.example.codingtest.test;

public class programmingTest2 {
    private int result;

    public programmingTest2() {
        this.result = 0;
    }

    public programmingTest2 add(int value) {
        this.result += value;
        return this;
    }

    public programmingTest2 subtract(int value) {
        this.result -= value;
        return this;
    }

    public int out() {
        return this.result;
    }

    public static void main(String[] args) {
        programmingTest2 programmingTest2 = new programmingTest2();
        int result = programmingTest2.add(4).add(5).subtract(3).out();
        System.out.println(result);
    }
}


