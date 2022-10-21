package com.github.tiagogomes187.aulaorm;

import com.github.tiagogomes187.aulaorm.entities.Department;
import com.github.tiagogomes187.aulaorm.entities.Employee;
import com.github.tiagogomes187.aulaorm.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AulaormApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AulaormApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Employee> result = repository.findAll();

		System.out.println("\n");

		for (Employee emp : result) {
			System.out.println(emp);
		}

	}
}
