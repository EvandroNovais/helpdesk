package com.evandro.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evandro.helpdesk.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
