package com.example.demo.Controller;


import com.example.demo.Model.Customer;
import com.example.demo.Repo.CustomerRepo;
import com.example.demo.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomerControl {
    @Autowired
    CustomerRepo customerRepo;

    @GetMapping("/")
    String get(Model model){
        model.addAttribute("customer",customerRepo.findAll());
        return "list";
    }

    @GetMapping("/signup")
    String signup(Customer customer){
        return "addcustomer";
    }

    @PostMapping("/add")
    String addCustomer(Customer customer, Model model, BindingResult result){
        if(result.hasErrors()){
            return "addcustomer";
        }
        customerRepo.save(customer);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    String edit(@PathVariable (value = "id") Long id,Model model){
        Customer customer = customerRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid"));
        model.addAttribute("customer",customer);
        return "updatecustomer";
    }

    @PostMapping("/update")
    String update(@PathVariable (value="id")Long id,Customer customer, BindingResult bindingResult, Model model) throws ResourceNotFound{
        if(bindingResult.hasErrors()){
            return "updatecustomer";
        }
        Customer updated= customerRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid"));
        updated.setCustomerId(id);
        updated.setCustomerName(customer.getCustomerName());
        updated.setEmail(customer.getEmail());
        updated.setMobileNo(customer.getMobileNo());
        customerRepo.save(updated);
        model.addAttribute("customer",customerRepo.findAll());
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    String delete(@PathVariable (value = "id")Long id, Model model){
        Customer updated= customerRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid"));
        customerRepo.delete(updated);
        model.addAttribute("customer",customerRepo.findAll());
        return "redirect:/";
    }
}
