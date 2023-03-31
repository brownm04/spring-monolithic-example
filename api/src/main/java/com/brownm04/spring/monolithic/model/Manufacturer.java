package com.brownm04.spring.monolithic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manufacturer {

	@Id
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manufacturer [name='" + name + "']";
	}
}
