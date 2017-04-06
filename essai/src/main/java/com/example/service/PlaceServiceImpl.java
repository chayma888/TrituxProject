package com.example.service;

import org.springframework.stereotype.Service;

import com.example.models.Place;
import com.example.repositories.PlaceRepository;

import javax.annotation.Resource;

@Service(value="placeService")
public class PlaceServiceImpl implements PlaceService{

	@Resource
	private PlaceRepository placeRepository;
	
	@Override
	public Place getPlaceByshortName(String shortName) {
		// TODO Auto-generated method stub
		return this.placeRepository.findByShortName(shortName);
	}

	@Override
	public Place createPlace(Place place) {
		// TODO Auto-generated method stub
		return this.placeRepository.save(place);
	}

}
