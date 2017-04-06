package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Place;
import com.example.service.PlaceService;

@RestController
@RequestMapping(value="/places")
public class PlaceController {

	@Autowired
	private PlaceService placeservice;
	
	@RequestMapping (method=RequestMethod.GET,value="/retourner")
	public Place getPlace (String name)
	{
		return this.placeservice.getPlaceByshortName(name);
	}
	
	@RequestMapping (method=RequestMethod.POST)
	public void setPlace (Place place)
	{
		 this.placeservice.createPlace(place);
	}

	
}
