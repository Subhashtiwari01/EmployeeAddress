package com.project.EmployeeAddress.Service;

import com.project.EmployeeAddress.Model.Address;
import com.project.EmployeeAddress.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public Iterable<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepo.findById(id);
    }

    public String addAddressById(Address address) {
        addressRepo.save(address);
        return "Information saved";
    }

    public String updateAddressById(Long id, Address address) {
        Optional<Address> updateAddress=addressRepo.findById(id);

        if(updateAddress!=null){
            addressRepo.save(address);
            return "Address Updated";
        }
        return "AddressNotFound";
    }

    public String deleteAddressById(Long id) {
         addressRepo.deleteById(id);
         return "Deleted";
    }
}
