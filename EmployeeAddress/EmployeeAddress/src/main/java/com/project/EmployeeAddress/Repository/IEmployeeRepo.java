package com.project.EmployeeAddress.Repository;

import com.project.EmployeeAddress.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
}
