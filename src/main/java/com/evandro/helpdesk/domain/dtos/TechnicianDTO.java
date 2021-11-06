package com.evandro.helpdesk.domain.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.evandro.helpdesk.domain.Technician;
import com.evandro.helpdesk.domain.enums.Profile;
import com.fasterxml.jackson.annotation.JsonFormat;

public class TechnicianDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
protected Integer id;
	
	protected String name;	
	
	protected String cpf;
	
	protected String email;
	
	protected String password;
	
	protected Set<Integer> profile = new HashSet<>();
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate createdAt = LocalDate.now();

	public TechnicianDTO() {
		super();
	}

	public TechnicianDTO(Technician obj) {
		super();
		this.id = obj.getId();
		this.name = obj.getName();
		this.cpf = obj.getCpf();
		this.email = obj.getEmail();
		this.password = obj.getPassword();
		this.profile = obj.getProfile().stream().map(x -> x.getId()).collect(Collectors.toSet());
		this.createdAt = obj.getCreatedAt();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Profile> getProfile() {
		return profile.stream().map(x -> Profile.toEnum(x)).collect(Collectors.toSet());
	}

	public void addProfile(Profile profile) {
		this.profile.add(profile.getId());
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

}
