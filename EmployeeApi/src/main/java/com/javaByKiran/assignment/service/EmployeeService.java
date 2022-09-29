package com.javaByKiran.assignment.service;

import java.util.List;

import com.javaByKiran.assignment.entity.Country;
import com.javaByKiran.assignment.entity.Employee;

import org.springframework.http.ResponseEntity;

public interface EmployeeService {
	ResponseEntity<List<Employee>> printAllEmployees();
	ResponseEntity<Employee> saveEmployee(Employee employee);
	void deleteEmployee(int id);
	ResponseEntity<Country> saveCountry(Country country);
	void deleteCountry(int id);
	ResponseEntity<List<Country>> printAllCountries();
	ResponseEntity<Employee> updateEmployeeDetails(int id, Employee employee);
	ResponseEntity<Country> updateCountryDetails(int id, Country country);
	

}
