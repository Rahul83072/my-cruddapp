package com.Devloper.Employee.Managment.system.Controller;

import com.Devloper.Employee.Managment.system.entity.EmployeeEntity;
import com.Devloper.Employee.Managment.system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
//  autowired inject karta hai automatically
//  jaise isme hamne employee service ko inject kia hai
    EmployeeService employeeService;
    @GetMapping
    public List<EmployeeEntity> findAllEmployee(){

        return employeeService.findAllEmployee();
    }
    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmployeeById (@PathVariable ("id")Long id){
        return employeeService.findById(id);
    }
    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.saveEmployee(employeeEntity);
    }
    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.updateEmployee(employeeEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id" ) Long id){

        employeeService.deleteEmployee(id);
    }

}
