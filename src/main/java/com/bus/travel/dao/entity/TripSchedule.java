package com.bus.travel.dao.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "trip_schedule")
public class TripSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tripScheId;
	
	@ManyToOne
	private Trip tripDetail;
	
	@OneToMany(targetEntity=Ticket.class, mappedBy="tripSchedule",cascade=CascadeType.ALL, fetch = FetchType.LAZY)    
	private List<Ticket> ticketsSold;

	private String tripDate;

	private int availableSeats;
}
