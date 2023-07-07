package com.project.EmployeeAddress.Controller;

import com.project.EmployeeAddress.Model.Employee;
import com.project.EmployeeAddress.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping("emp")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }


    @GetMapping("emp/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable long id){
        return employeeService.getEmployeeById(id);
    }


    @PostMapping("addemp")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }


    @PutMapping("update/{id}")
    public String updateEmployeeById(@PathVariable long id,@RequestBody Employee employee){
        return employeeService.updateEmployeeById(id,employee);
    }


    @DeleteMapping("deleteemp/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);

    }

}


//GET /employees - get all employees
//        DELETE /employees/{id} - delete an employee by id
