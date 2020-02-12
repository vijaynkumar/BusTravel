package com.bus.travel.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "stop")
public class Stop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long stopId;

	private String code;

	private String name;

	private String detail;

}
