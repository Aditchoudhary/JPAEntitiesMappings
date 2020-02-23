package com.adit.onetomany.CompositeKeySpringJPA.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="phone")
public class Phone {
	
	private Long number;
	private String country;
	private Employee employee;
	
	@Id
	@Column(name="mobileno")
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	
	@Column(name="country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@ManyToOne
	@JoinColumns ({
	@JoinColumn(name="empid", referencedColumnName="empid", nullable=true),
	@JoinColumn(name="companyid", referencedColumnName="companyid", nullable=true)
	})
	@JsonIgnore
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
