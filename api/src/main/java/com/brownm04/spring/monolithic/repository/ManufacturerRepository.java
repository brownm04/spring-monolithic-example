package com.brownm04.spring.monolithic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brownm04.spring.monolithic.model.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, String> {

	public Manufacturer findByName(String name);
}
