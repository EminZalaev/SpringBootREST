package com.example.project.dao;

import com.example.project.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

        Query query = entityManager.createQuery("from Employee");

        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {

        entityManager.merge(employee);
    }

    @Override
    public Employee getEmployee(int id) {

        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

}
