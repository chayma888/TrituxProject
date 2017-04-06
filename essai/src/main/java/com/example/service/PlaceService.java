package com.example.service;

import com.example.models.Place;

public interface PlaceService {

	public Place getPlaceByshortName(String shortName);
	public Place createPlace (Place place);
	
}
