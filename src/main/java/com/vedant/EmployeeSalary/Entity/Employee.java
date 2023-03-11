package com.vedant.EmployeeSalary.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "employeeinfo")
public class Employee {

    @Id
    private Long id;
    private String name;
    private float salary;
    private String designation;


}
