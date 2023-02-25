package com.rushikesh.associationsmanytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssociationsManyToManyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AssociationsManyToManyApplication.class, args);
	
	ProgrammerRepository repo   =	context.getBean(ProgrammerRepository.class);


		
	}

}
