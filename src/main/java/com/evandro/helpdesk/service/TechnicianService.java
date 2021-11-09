package com.evandro.helpdesk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evandro.helpdesk.domain.Technician;
import com.evandro.helpdesk.repositories.TechnicianRepository;
import com.evandro.helpdesk.service.exceptions.ObjectNotFoundException;

@Service
public class TechnicianService{
	
	@Autowired
	private TechnicianRepository technicianRepository;
	
	public Technician findById(Integer id) {
		
		Optional<Technician> obj = technicianRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Técnico com Id: " + id + " não Encontrado!"));
		
	}

}
