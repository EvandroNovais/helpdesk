package com.evandro.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evandro.helpdesk.domain.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
