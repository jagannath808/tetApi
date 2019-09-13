package com.TestApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestApi.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
