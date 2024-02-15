package com.Devloper.Employee.Managment.system.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity
//indicate kar raha hai hamari class ek entity hai
@Table(name="mt_employee")
//specifies name od data base table which thhis entity map
public class EmployeeEntity {
    @Id
//    indicate primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    auto increment kar raha hai column ko
    @Column(name = "emp_id")
//    colum - specifies the mapping of the enitty attribute to the column in the databse
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
//    @Column(name = "date_of_birth")
//    private Date dateOfBirth;
    @Column(name = "addresss")
    private String address;

    public EmployeeEntity() {

    }

    public EmployeeEntity(Long id, String name, String gender,  String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
//        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

//    public Date getDateOfBirth() {
//
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(Date dateOfBirth) {
//
//        this.dateOfBirth = dateOfBirth;
//    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }
}
