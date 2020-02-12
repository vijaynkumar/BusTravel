package com.bus.travel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.travel.dao.entity.Agency;
import com.bus.travel.dao.repository.AgencyRepository;
import com.bus.travel.service.AgencyService;

@Service
public class AgencyServiceImpl implements AgencyService{
	
	@Autowired
	private AgencyRepository agencyRepository;
	
	@Override
	public Agency addAgency(Agency agencyRequest) {
		if(null != agencyRequest) {
			agencyRepository.save(agencyRequest);
			return agencyRequest;
		}
		return null;
	}

}
