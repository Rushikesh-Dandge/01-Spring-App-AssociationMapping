package com.rushikesh.associationsmanytomany.repository;

import org.springframework.data.repository.CrudRepository;

import com.rushikesh.associationsmanytomany.entity.Programmer;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

}
