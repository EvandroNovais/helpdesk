package com.evandro.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import com.evandro.helpdesk.domain.enums.Ticket;

public class Customer extends Person {
	
	private List<Ticket> ticket = new ArrayList<>();

	public Customer() {
		super();
	}

	public Customer(Integer id, String name, String cpf, String email, String password) {
		super(id, name, cpf, email, password);
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}		

}
