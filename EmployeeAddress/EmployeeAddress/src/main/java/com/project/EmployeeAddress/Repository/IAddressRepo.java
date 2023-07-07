package com.project.EmployeeAddress.Repository;

import com.project.EmployeeAddress.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {
}
