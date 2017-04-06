package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
	
	public Place findByShortName(String shortName);
	@SuppressWarnings("unchecked")
	public Place save(Place place);

}
