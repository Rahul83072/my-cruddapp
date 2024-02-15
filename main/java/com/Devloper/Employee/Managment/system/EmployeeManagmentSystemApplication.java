package com.Devloper.Employee.Managment.system;

import ch.qos.logback.classic.pattern.TargetLengthBasedClassNameAbbreviator2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import static javax.print.attribute.standard.MediaSizeName.C;


@SpringBootApplication
public class EmployeeManagmentSystemApplication {

	@Autowired
	public static void main(String[] args) {

		SpringApplication.run(EmployeeManagmentSystemApplication.class, args);
	}

}
