package com.adit.onetomany.CompositeKeySpringJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adit.onetomany.CompositeKeySpringJPA.entities.Employee;
import com.adit.onetomany.CompositeKeySpringJPA.entities.EmployeeId;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeId> {

	public Employee findByEmployeeIdEmpid(Long id);
}