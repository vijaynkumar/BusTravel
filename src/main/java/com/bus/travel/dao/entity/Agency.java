package com.bus.travel.dao.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import com.bus.travel.dao.entity.User;

@Data
@Entity
@Table(name = "agency")
public class Agency {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long agencyId;

	private String code;

	private String name;

	private String details;

	@ManyToOne
	private User owner;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "agency_bus", joinColumns = { @JoinColumn(name = "agencyId") }, inverseJoinColumns = {
			@JoinColumn(name = "busId") })
	private Set<Bus> buses;
}
