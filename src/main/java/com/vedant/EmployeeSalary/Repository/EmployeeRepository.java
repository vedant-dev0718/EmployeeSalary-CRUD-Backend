package com.vedant.EmployeeSalary.Repository;

import com.vedant.EmployeeSalary.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
