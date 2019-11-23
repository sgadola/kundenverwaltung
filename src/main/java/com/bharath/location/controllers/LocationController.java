package com.bharath.location.controllers;

import com.bharath.location.entities.Address;
import com.bharath.location.entities.Contact;
import com.bharath.location.entities.Customer;
import com.bharath.location.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class LocationController {

    @Autowired
    CustomerService service;

    
    // Get-Request
    @RequestMapping("/")
    public String index() {
        return "createCustomers";
    }

    // Get-Request
    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createCustomers";
    }

    // Post-Request
    @RequestMapping("/saveLoc")
    public String saveCustomer(@ModelAttribute("customer") Customer customer,
                               @ModelAttribute("address") Address address,
                               @ModelAttribute("contact") Contact contact, ModelMap modelMap) {
        Customer customerSaved = service.saveCustomer(customer);
        long fkCustomer = customerSaved.getId();
        address.setFk_customer(fkCustomer);

        service.saveAddress(address);

        contact.setFk_customer(fkCustomer);

        service.saveContact(contact);

        String msg = "Customer saved with id " + customerSaved.getId();
        modelMap.addAttribute("msg", msg);

        return "createCustomers";
    }

    // Get-Request
    @RequestMapping("/displayCustomers")
    public String displayCustomers(ModelMap modelMap) {
        List<Customer> customers = service.getAllCustomers();
        modelMap.addAttribute("customers", customers);

        return "displayCustomers";
    }

    // Post-Request
    @RequestMapping("deleteCustomer")
    public String deleteCustomer(@RequestParam("id") long id, ModelMap modelMap) {
        Customer customer = service.getCustomerById(id);
        customer.setId(id);
        service.deleteCustomer(customer);
        List<Customer> customers = service.getAllCustomers();

        modelMap.addAttribute("customers", customers);

        return "displayCustomers";
    }

    // Get-Request
    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") long id, ModelMap modelMap, ModelMap modelMap1, ModelMap modelMap2) {
        Customer customer = service.getCustomerById(id);
        Address address = service.getAddressByFk(id);
        Contact contact = service.getContactByFk(id);

        modelMap.addAttribute("customer", customer);
        modelMap1.addAttribute("address", address);
        modelMap2.addAttribute("contact", contact);

        return "updateCustomers";
    }

    // Post-Request
    @RequestMapping("/updateLoc")
    public String updateCustomer(@ModelAttribute("customer") Customer customer,
                                 @ModelAttribute("address") Address address,
                                 @ModelAttribute("contact") Contact contact, ModelMap modelMap) {
        Customer customerSaved = service.updateCustomer(customer);
        long fkCustomer = customerSaved.getId();
        address.setFk_customer(fkCustomer);
        service.updateAddress(address);
        contact.setFk_customer(fkCustomer);
        service.updateContact(contact);
        List<Customer> customers = service.getAllCustomers();

        modelMap.addAttribute("customers", customers);

        return "displayCustomers";
    }
}