package com.evandro.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evandro.helpdesk.domain.Technician;

public interface TechnicianRepository extends JpaRepository<Technician, Integer>{

}
