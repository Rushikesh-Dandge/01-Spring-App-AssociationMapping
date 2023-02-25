package com.rushikesh.associationsmanytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Programmer {

	public Programmer(int id, String name, int salary, Set<Project> projects) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.projects = projects;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AssociationsManyToManyApplication.class, args);
	
	ProgrammerRepository repo   =	context.getBean(ProgrammerRepository.class);

     Programmer p = new Programmer();
     p.setName("Sujata");
     p.setSalary(450000000);
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int salary;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "programmers_projects",
	joinColumns = @JoinColumn(name = "programmer_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "project_id" , referencedColumnName = "id"))
	private Set<Project>  projects;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + ", salary=" + salary + ", projects=" + projects + "]";
	}
	
	
}
