package com.Devloper.Employee.Managment.system.repository;
import com.Devloper.Employee.Managment.system.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

//it is eligibile for spring data jpa repository scammimg and
// execution translation
//ek jpa repository hai jisme spring data jpa interface hai employee
// repository inherit various crud method for the employee enitity
// suh as save, find by id , find all , update , delete

}
