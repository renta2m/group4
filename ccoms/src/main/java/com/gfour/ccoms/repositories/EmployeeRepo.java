package com.gfour.ccoms.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gfour.ccoms.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
    Employee findByEmailIDAndPassword(String emailId, String password);
}
