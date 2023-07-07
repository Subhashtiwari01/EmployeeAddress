package com.project.EmployeeAddress.Service;

import com.project.EmployeeAddress.Model.Employee;
import com.project.EmployeeAddress.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;
    public Iterable<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public String addEmployee(Employee employee) {
         employeeRepo.save(employee);
        return"Employee Added";
    }

    public Optional<Employee> getEmployeeById(long id) {
        return employeeRepo.findById(id);
    }

    public String updateEmployeeById(long id, Employee employee) {
        Optional<Employee> updateEmp=employeeRepo.findById(id);
        if(updateEmp!=null){
            employeeRepo.save(employee);
            return "Information Updated";
        }
        return "Employee NotFound";


    }

    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "Deleted";

    }
}
