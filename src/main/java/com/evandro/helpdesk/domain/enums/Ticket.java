package com.evandro.helpdesk.domain.enums;

import java.time.LocalDate;

import com.evandro.helpdesk.domain.Customer;
import com.evandro.helpdesk.domain.Technician;

public class Ticket {
	
	private Integer id;
	private LocalDate openingDate = LocalDate.now();
	private LocalDate closingDate;
	private Priority priority; 
	private Status status;
	private String title;
	private String comments;
	
	private Technician tecnico;
	private Customer customer;
	
	public Ticket() {
		super();
	}

	public Ticket(Integer id, Priority priority, Status status, String title, String comments, Technician tecnico,
			Customer customer) {
		super();
		this.id = id;
		this.priority = priority;
		this.status = status;
		this.title = title;
		this.comments = comments;
		this.tecnico = tecnico;
		this.customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public LocalDate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Technician getTecnico() {
		return tecnico;
	}

	public void setTecnico(Technician tecnico) {
		this.tecnico = tecnico;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
