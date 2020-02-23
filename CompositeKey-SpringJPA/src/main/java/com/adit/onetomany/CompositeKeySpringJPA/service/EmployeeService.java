package com.adit.onetomany.CompositeKeySpringJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adit.onetomany.CompositeKeySpringJPA.entities.Employee;
import com.adit.onetomany.CompositeKeySpringJPA.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee getEmployee(Long id) {
		return employeeRepository.findByEmployeeIdEmpid(id);
	}
	
	public void saveEmployee(Employee e){
		employeeRepository.save(e);
	}
}
