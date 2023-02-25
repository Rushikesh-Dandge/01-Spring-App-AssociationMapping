package com.rushikesh.associationsmanytomany;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.rushikesh.associationsmanytomany.entity.Programmer;
import com.rushikesh.associationsmanytomany.entity.Project;
import com.rushikesh.associationsmanytomany.repository.ProgrammerRepository;

@SpringBootTest
class AssociationsManyToManyApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	ProgrammerRepository programmerrepository;
	
	@Test
	public void testCreateData() {
		
		Programmer programmer = new Programmer();
		programmer.setName("Rushikesh");
		programmer.setSalary(4000);
		HashSet<Project> projects = new HashSet<Project>();
		Project project1 = new Project();
		project1.setName("Hibernate Projects");
		
		projects.add(project1);
		
		programmer.setProjects(projects);
		
		programmerrepository.save(programmer);
	}

	@Test
	@Transactional
	public void getReadData() {
		
		Programmer programmer = programmerrepository.findById(1).get();
		System.out.println(programmer);
		System.out.println(programmer.getProjects());
		programmerrepository.save(programmer);
	}
}
