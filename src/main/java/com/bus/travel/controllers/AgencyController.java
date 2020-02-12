package com.bus.travel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.travel.dao.entity.Agency;
import com.bus.travel.service.AgencyService;

@RestController
@RequestMapping("/agency")
public class AgencyController {
	
	
	@Autowired
	private AgencyService agencyService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<?> addAgency(@RequestBody Agency agencyRequest){
		agencyService.addAgency(agencyRequest);
		return ResponseEntity.ok(agencyRequest);	
	}

}
