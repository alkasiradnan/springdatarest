package com.example.springdatarest.employee.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
