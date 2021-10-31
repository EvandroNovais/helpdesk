package com.evandro.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evandro.helpdesk.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
