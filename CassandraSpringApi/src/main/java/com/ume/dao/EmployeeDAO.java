package com.ume.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ume.entity.Employee;
import com.ume.util.MyCassandraTemplate;

/**
 * DAOImpl class for Employee to perform CRUD operation.
 * @author ume Reddy
 * @version 1.0
 */
@Repository
public class EmployeeDAO{
    
    @Autowired
    private MyCassandraTemplate myCassandraTemplate;
    
    
    public Employee createEmployee(Employee employee) {     
        return myCassandraTemplate.create(employee);
    }
    
    
    public Employee getEmployee(int id) {       
        return myCassandraTemplate.findById(id, Employee.class);
    }
    
    
    public Employee updateEmployee(Employee employee) {     
        return myCassandraTemplate.update(employee, Employee.class);
    }

    
    public void deleteEmployee(int id) {        
        myCassandraTemplate.deleteById(id, Employee.class);
    }

    
    public List<Employee> getAllEmployees() {       
        return myCassandraTemplate.findAll(Employee.class);
    }
}