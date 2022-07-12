package com.sparta.wt;

public class App {
    public static Integer fibSeqNumberAt(Integer position) {
        int FibonacciNumber;

        if (position == null) {
            return 0;
        } else if (position <= 0) {
            FibonacciNumber = 0;
        } else if (position <= 2) {
            FibonacciNumber = 1;
        } else {
            return fibSeqNumberAt(position - 1) + fibSeqNumberAt(position - 2);
        }
        return FibonacciNumber;
    }

    public static int[] fibSeqAsArray(Integer position) {
        if (position == null || position <= 0) return new int[0];
        int[] array = new int[position];
        for (int i = 0; i < array.length; i++) {
            array[i] = fibSeqNumberAt(i);
        }
        return array;
    }

}
