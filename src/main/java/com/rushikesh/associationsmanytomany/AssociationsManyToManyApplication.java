package com.rushikesh.associationsmanytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rushikesh.associationsmanytomany.entity.Programmer;
import com.rushikesh.associationsmanytomany.repository.ProgrammerRepository;

@SpringBootApplication
public class AssociationsManyToManyApplication {
//Infosys
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AssociationsManyToManyApplication.class, args);
	
	ProgrammerRepository repo   =	context.getBean(ProgrammerRepository.class);

     Programmer p = new Programmer();
     p.setName("Sujata");
     p.setSalary(450000000);
		
	}

}
