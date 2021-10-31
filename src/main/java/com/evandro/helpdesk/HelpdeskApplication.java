package com.evandro.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.evandro.helpdesk.domain.Customer;
import com.evandro.helpdesk.domain.Technician;
import com.evandro.helpdesk.domain.Ticket;
import com.evandro.helpdesk.domain.enums.Priority;
import com.evandro.helpdesk.domain.enums.Profile;
import com.evandro.helpdesk.domain.enums.Status;
import com.evandro.helpdesk.repositories.CustomerRepository;
import com.evandro.helpdesk.repositories.TechnicianRepository;
import com.evandro.helpdesk.repositories.TicketRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{
	
	@Autowired
	private TechnicianRepository technicianRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private TicketRepository ticketRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Technician tech1 = new Technician(null, "Evandro Novais", "17573378068", "evandro@email.com", "123456");
		tech1.addProfile(Profile.ADMIN);
		
		Customer cust1 = new Customer(null, "Linus Torvalds", "72448356041", "torvalds@email.com", "123456");
		cust1.addProfile(Profile.CUSTOMER);
		
		Ticket tck1 = new Ticket(null, Priority.MEDIUM, Status.PROGRESS, "Ticket 01", "First ticket", tech1, cust1);
		
		technicianRepository.saveAll(Arrays.asList(tech1));		
		customerRepository.saveAll(Arrays.asList(cust1));
		ticketRepository.saveAll(Arrays.asList(tck1));		
	
	}	
 
}
