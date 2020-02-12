package com.bus.travel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.travel.dao.entity.Bus;
import com.bus.travel.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
	private BusService busService;
	
	@RequestMapping(value = "/add",  method = RequestMethod.POST)
	public ResponseEntity<?> addBus(@RequestBody Bus busRequest){
		busService.addBus(busRequest);
		return ResponseEntity.ok(busRequest);	
	}

}
