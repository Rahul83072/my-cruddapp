package com.Devloper.Employee.Managment.system.service;

import com.Devloper.Employee.Managment.system.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
//return list of employee
    Optional<EmployeeEntity> findById(Long id);
//find a employee if by there name
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
//save a new employee entity
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
//update existing employee entity
    void deleteEmployee(Long id);
//delete an employee

//using request for save and update employee



}