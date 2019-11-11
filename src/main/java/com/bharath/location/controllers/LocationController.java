package com.bharath.location.controllers;
import com.bharath.location.entities.Address;
import com.bharath.location.entities.Contact;
import com.bharath.location.entities.Costumer;
import com.bharath.location.service.LocationService;
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
    LocationService service;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("costumer") Costumer costumer,
                               @ModelAttribute("address")  Address address,
                               @ModelAttribute("contact")  Contact contact, ModelMap modelMap){
        Costumer costumerSaved = service.saveLocation(costumer);
        long fkCustomer = costumerSaved.getId();
        address.setFkCostumer(fkCustomer);
        service.saveAddress(address);
        contact.setFkcostumer(fkCustomer);
        service.saveContact(contact);
        String msg = "Costumer saved with id " + costumerSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap){
        List<Costumer> costumers = service.getAllLocations();
        modelMap.addAttribute("costumers", costumers);
        return "displayLocations";
    }

    @RequestMapping("deleteLocations")
    public String deleteLocation(@RequestParam("id") long id, ModelMap modelMap){
        //Costumer costumer = service.getLocationById(id);
        Costumer costumer = new Costumer();
        costumer.setId(id);
        service.deleteLocation(costumer);
        List<Costumer> costumers = service.getAllLocations();
        modelMap.addAttribute("costumers", costumers);
        return "displayLocations";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") long id, ModelMap modelMap) {
        Costumer costumer = service.getLocationById(id);
        modelMap.addAttribute("costumer", costumer);
        return "updateLocations";
    }

    @RequestMapping("/updateLoc")
    public String saveLocations(@ModelAttribute("costumer") Costumer costumer, ModelMap modelMap){
        service.updateLocation(costumer);
        List<Costumer> costumers = service.getAllLocations();
        modelMap.addAttribute("costumers", costumers);
        return "displayLocations";
    }

}
