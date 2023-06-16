package com.technicaltest;

import com.technicaltest.entity.Person;
import com.technicaltest.service.ServiceClass;
import com.technicaltest.service.impl.ServiceClassImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    private ServiceClass service;

    @BeforeEach
    void setUp() {
        service = new ServiceClassImpl();
    }

    @Test
    void applicationTestSuccess() {

        Person personA = new Person();
        personA.setAgeOfDeath(10);
        personA.setYearOfDeath(12);
        int peopleKilledA = service.peopleKilled(personA.getYearBorn());

        Person personB = new Person();
        personB.setAgeOfDeath(13);
        personB.setYearOfDeath(17);
        int peopleKilledB = service.peopleKilled(personB.getYearBorn());

        double averageKilling = service.averageKilling(peopleKilledB, peopleKilledA);

        System.out.println(String.format(
                "So the average is (%d + %d) / 2 = %.1f",
                peopleKilledB, peopleKilledA, averageKilling
        ));

        Assertions.assertEquals(4.5, averageKilling);

    }

    @Test
    void applicationTestFailed() {

        Person personA = new Person();
        personA.setAgeOfDeath(10);
        personA.setYearOfDeath(2);
        int peopleKilledA = service.peopleKilled(personA.getYearBorn());

        Person personB = new Person();
        personB.setAgeOfDeath(13);
        personB.setYearOfDeath(7);
        int peopleKilledB = service.peopleKilled(personB.getYearBorn());

        double averageKilling = service.averageKilling(peopleKilledB, peopleKilledA);

        System.out.println(String.format(
                "So the average is (%d + %d) / 2 = %.1f",
                peopleKilledB, peopleKilledA, averageKilling
        ));

        Assertions.assertEquals(-1, averageKilling);

    }
}
