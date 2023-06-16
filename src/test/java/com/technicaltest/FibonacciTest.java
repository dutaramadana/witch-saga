package com.technicaltest;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void fibonacciTest() {
        fibonacci(5);
    }

    private int fibonacci(int value){

        int index;
        int first = 0;
        int second = 1;

        int total = 0;

        for (int i = 1; i <= value; i++) {
            index = first + second;
            second = first;
            first = index;

            total += index;
            System.out.println(index);
        }

        if(value < 0 || total < 0){
            return -1;
        }

        System.out.println("Total: " + total);
        return total;
    }
}
