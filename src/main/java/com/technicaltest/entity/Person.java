package com.technicaltest.entity;

public class Person {


    private int ageOfDeath;
    private int yearOfDeath;
    private int yearBorn;

    public int getYearBorn() {
        return yearOfDeath - ageOfDeath;
    }

    public int getAgeOfDeath() {
        return ageOfDeath;
    }

    public void setAgeOfDeath(int ageOfDeath) {
        this.ageOfDeath = ageOfDeath;
    }

    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

}
