package com.vedant.EmployeeSalary.Service;

import com.vedant.EmployeeSalary.Entity.Employee;
import com.vedant.EmployeeSalary.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> listAll(){
        return repository.findAll();
    }
    public void save(Employee employee) {
        repository.save(employee);
    }

    public Employee get(long id) {
        return repository.findById(id).get();
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

}
