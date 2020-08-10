package com.Connector.triggerdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Connector.triggerdetails.model.jSONModel;
import com.Connector.triggerdetails.service.getJSONService;

@RestController
@RequestMapping({ "/GetJSON" })
public class triggercontroller {
	
	@Autowired
	getJSONService getJsonService;
	 
	@PostMapping(value = "/details")
	public List<jSONModel> getJSONDetails(@RequestBody jSONModel jsonModel) {
		return getJsonService.getJsonDetails(jsonModel);
	}
	@GetMapping(value = "/{id}")
	public String getValue(@PathVariable String id) {
		
		return id;
	}

}
