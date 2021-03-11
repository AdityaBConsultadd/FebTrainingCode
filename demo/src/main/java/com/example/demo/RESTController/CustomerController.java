package com.example.demo.RESTController;

import com.example.demo.Model.Customer;
import com.example.demo.Repo.CustomerRepo;
import com.example.demo.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping("/get")
    List<Customer> get(){
        return customerRepo.findAll();
    }

    @PostMapping("/post")
    Customer post(@RequestBody Customer customer){
        return customerRepo.save(customer);
    }

    @DeleteMapping("/delete/{id}")
    String delete(@PathVariable (value = "id") long id) throws ResourceNotFound {
        Customer customer = customerRepo.findById(id).orElseThrow(()-> new ResourceNotFound("Not Found",id,"Customer not found"));
        customerRepo.delete(customer);
        return "deleted";
    }

    @PutMapping("/put/{id}")
    Customer put(@PathVariable (value = "id") long id, @RequestBody Customer customer) throws ResourceNotFound {
        Customer update= customerRepo.findById(id).orElseThrow(()-> new ResourceNotFound("Not Found",id,"Customer not found"));
        update.setCustomerName(customer.getCustomerName());
        update.setEmail(customer.getEmail());
        update.setMobileNo(customer.getMobileNo());
        return customerRepo.save(update);
    }

    @GetMapping("/q")
    List<Customer> q(){
        return customerRepo.q1();
    }
    @GetMapping("/q1/{s}")
    List<Customer> q1(@PathVariable(value = "s")String s){
        return customerRepo.q2(s);
    }

    @GetMapping("/get/{id}")
    Customer getSingle(@PathVariable (value = "id") long id) throws ResourceNotFound{
        return customerRepo.findById(id).orElseThrow(()-> new ResourceNotFound("Not Found",id,"Customer not found"));
    }



//    @DeleteMapping("/delete/{id}")
//    ResponseEntity<?> delete(@PathVariable (value = "id") long id) throws ResourceNotFound {
//        Optional<Customer> customer = customerRepo.findById(id);
//        customerRepo.delete(customer.get());
//        return ResponseEntity.ok().build();
//    }

}
