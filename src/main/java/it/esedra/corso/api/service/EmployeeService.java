package it.esedra.corso.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esedra.corso.api.entity.Employee;
import it.esedra.corso.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	  @Autowired
	    private EmployeeRepository employeeRepository;

	    public Optional<Employee> getEmployee(final Long id) {
	        return employeeRepository.findById(id);
	    }

	    public Iterable<Employee> getEmployees() {
	        return employeeRepository.findAll();
	    }

	    public void deleteEmployee(final int id) {
	        employeeRepository.deleteById((long) id);
	    }

	    public Employee saveEmployee(Employee employee) {
	        Employee savedEmployee = employeeRepository.save(employee);
	        return savedEmployee;
	    }

}
