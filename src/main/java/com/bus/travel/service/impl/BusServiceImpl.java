package com.bus.travel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.travel.dao.entity.Bus;
import com.bus.travel.dao.repository.BusRepository;
import com.bus.travel.service.BusService;

@Service
public class BusServiceImpl implements BusService{

	@Autowired
	private BusRepository busRepository;
	
	@Override
	public Bus addBus(Bus busRequest) {
		if(null != busRequest) {
			busRepository.save(busRequest);
			return busRequest;
		}
		return null;
	}

}
