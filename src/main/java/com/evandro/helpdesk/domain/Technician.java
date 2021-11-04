package com.evandro.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.evandro.helpdesk.domain.enums.Profile;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "TB_TECHNICIAN")
public class Technician extends Person{
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@OneToMany(mappedBy = "technician")
	private List<Ticket> ticket = new ArrayList<>();

	public Technician() {
		super();
		addProfile(Profile.CUSTOMER);
	}

	public Technician(Integer id, String name, String cpf, String email, String password) {
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
