package com.project.EmployeeAddress.Controller;

import com.project.EmployeeAddress.Model.Address;
import com.project.EmployeeAddress.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("address")

    public Iterable<Address> getAllAddress(){
        return addressService.getAllAddress();

    }
    @GetMapping("address/{id}")

    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }


    @PostMapping("addAddress")
    public String addAddressById(@RequestBody Address address){
        return addressService.addAddressById(address);

    }
    @PutMapping("updateAddress/{id}")
    public String updateAddressById(@PathVariable Long id,@RequestBody Address address){
        return addressService.updateAddressById(id,address);
    }
    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }

}
