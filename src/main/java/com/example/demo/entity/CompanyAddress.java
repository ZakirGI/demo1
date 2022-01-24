package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class CompanyAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "companyaddress_id", referencedColumnName = "company_id")
	private Integer id;
	String street;
	String house;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}	

}
