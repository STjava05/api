package it.esedra.corso.api.repository;


import org.springframework.data.repository.CrudRepository;


import it.esedra.corso.api.entity.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	
}
