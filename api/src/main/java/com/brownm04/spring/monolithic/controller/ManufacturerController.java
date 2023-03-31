package com.brownm04.spring.monolithic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brownm04.spring.monolithic.model.Manufacturer;
import com.brownm04.spring.monolithic.repository.ManufacturerRepository;

@RestController
@RequestMapping("/manufacturer")
public class ManufacturerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ManufacturerController.class);

	@Autowired
	private ManufacturerRepository manufacturerRepo;

	@GetMapping("/{manufacturer}")
	public Manufacturer manufacturer(@PathVariable String manufacturer) {
		manufacturer = manufacturer.strip();

		LOGGER.info("Getting Manufacturer for '{}'", manufacturer);

		return manufacturerRepo.findByName(manufacturer);
	}
}
