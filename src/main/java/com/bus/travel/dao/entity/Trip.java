package com.bus.travel.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "trip")
public class Trip {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tripId;

	private int fare;

	private int journeyTime;
	
	@ManyToOne
	private Stop sourceStop;
	
	@ManyToOne   
	private Stop destStop;
	
	@ManyToOne 
	private Bus bus;
	
	@ManyToOne   
	private Agency agency;
}
