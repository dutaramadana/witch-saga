package com.technicaltest;

import com.technicaltest.entity.Person;
import com.technicaltest.service.ServiceClass;
import com.technicaltest.service.impl.ServiceClassImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnicalTestApplication {

	private static ServiceClass service = new ServiceClassImpl();

	public static void main(String[] args) {
		SpringApplication.run(TechnicalTestApplication.class, args);

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

	}

}
