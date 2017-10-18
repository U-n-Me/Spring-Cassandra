package com.ume.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ume.dao.EmployeeDAO;
import com.ume.entity.Employee;


@Service
public class EmployeeService {

    @Autowired  
    private EmployeeDAO employeeDAO;

    /**
     * Default Constructor
     */
    public EmployeeService() {
        System.out.println("EmployeeService()"); 
    }

     
    public Employee createEmployee(Employee employee) {     
        return employeeDAO.createEmployee(employee);
    }

      
    public Employee getEmployee(int id) {       
        return employeeDAO.getEmployee(id);
    }

      
    public Employee updateEmployee(Employee employee) {     
        return employeeDAO.updateEmployee(employee);
    }

      
    public void deleteEmployee(int id) {        
        employeeDAO.deleteEmployee(id);
    }

      
    public List<Employee> getAllEmployees() {       
        return employeeDAO.getAllEmployees();
    }

}