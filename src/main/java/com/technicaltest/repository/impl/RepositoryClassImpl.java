package com.technicaltest.repository.impl;

import com.technicaltest.repository.RepositoryClass;

public class RepositoryClassImpl implements RepositoryClass {

    @Override
    public int peopleKilled(int value) {
        int index;
        int first = 0;
        int second = 1;

        int total = 0;

        for (int i = 1; i <= value; i++) {
            index = first + second;
            second = first;
            first = index;

            total += index;
        }

        if(value < 0 || total < 0){
            return -1;
        }

        return total;
    }

    @Override
    public double averageKilling(int yearA, int yearB) {
        return (yearA + yearB)/2.0;
    }

}
