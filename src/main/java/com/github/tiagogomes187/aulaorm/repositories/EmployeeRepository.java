package com.github.tiagogomes187.aulaorm.repositories;

import com.github.tiagogomes187.aulaorm.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
