package com.github.tiagogomes187.aulaorm.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department departiment;

    public Employee() {
    }


    public Employee(Long id, String name, Double salary, Department departiment) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departiment = departiment;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartiment() {
        return departiment;
    }

    public void setDepartiment(Department departiment) {
        this.departiment = departiment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getId(), employee.getId()) && Objects.equals(getName(), employee.getName()) && Objects.equals(getSalary(), employee.getSalary()) && Objects.equals(getDepartiment(), employee.getDepartiment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary(), getDepartiment());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", departiment=" + departiment +
                '}';
    }
}
