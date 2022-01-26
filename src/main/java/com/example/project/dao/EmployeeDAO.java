package com.example.project.dao;


import com.example.project.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void addSalaryForEmployee(int id, int salary);

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

}
