package com.technicaltest.service.impl;

import com.technicaltest.repository.RepositoryClass;
import com.technicaltest.repository.impl.RepositoryClassImpl;
import com.technicaltest.service.ServiceClass;

public class ServiceClassImpl implements ServiceClass {

    private RepositoryClass repository = new RepositoryClassImpl();

    @Override
    public int peopleKilled(int personYearBorn) {
        return repository.peopleKilled(personYearBorn);
    }

    @Override
    public double averageKilling(int a, int b) {
        return repository.averageKilling(a, b);
    }


}
