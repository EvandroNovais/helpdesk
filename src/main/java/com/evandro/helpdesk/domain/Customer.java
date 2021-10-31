package com.evandro.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.evandro.helpdesk.domain.enums.Profile;

@Entity(name = "TB_CUSTOMER")
public class Customer extends Person {	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "customer")
	private List<Ticket> ticket = new ArrayList<>();

	public Customer() {
		super();
		addProfile(Profile.CUSTOMER);
	}

	public Customer(Integer id, String name, String cpf, String email, String password) {
		super(id, name, cpf, email, password);
		addProfile(Profile.CUSTOMER);
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}		

}
