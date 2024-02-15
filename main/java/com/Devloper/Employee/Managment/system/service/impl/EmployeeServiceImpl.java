package com.Devloper.Employee.Managment.system.service.impl;

import com.Devloper.Employee.Managment.system.entity.EmployeeEntity;
import com.Devloper.Employee.Managment.system.repository.EmployeeRepository;
import com.Devloper.Employee.Managment.system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> findAllEmployee() {

        return employeeRepository.findAll();
    }
//     retrive all employee entites bye delegating the call find all

    @Override
    public Optional<EmployeeEntity> findById(Long id) {

        return employeeRepository.findById(id);
    }
//retrive and entity  employee by their id
    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }
//save a new employee entity to the database
    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }
//update an existing employee enitity in the databse
    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }
//    delete an employee entity from the database by its id using delet by id
}

