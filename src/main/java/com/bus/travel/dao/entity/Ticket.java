package com.bus.travel.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ticketId;

	private int seatNumber;

	private boolean cancellable;

	private String journeyDate;

	@ManyToOne
	private TripSchedule tripSchedule;

	@ManyToOne
	private User passenger;
}
