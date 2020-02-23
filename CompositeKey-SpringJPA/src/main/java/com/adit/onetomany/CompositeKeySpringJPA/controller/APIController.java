package com.adit.onetomany.CompositeKeySpringJPA.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adit.onetomany.CompositeKeySpringJPA.entities.Employee;

import com.adit.onetomany.CompositeKeySpringJPA.service.EmployeeService;


@RestController
public class APIController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/employee/{empid}")
	public Employee getEmployee(@PathVariable("empid") Long empid) {
		return employeeService.getEmployee(empid);
	}

	@PostMapping(path = "/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		employee.getPhones().stream().forEach(e-> e.setEmployee(employee));
		employeeService.saveEmployee(employee);
		return employee;	
	}
}
