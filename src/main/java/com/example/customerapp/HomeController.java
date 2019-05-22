package com.example.customerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/")
    public String HomePage(Model model){
        model.addAttribute("customers", customerRepository.findAll());
        return "list";
    }

    @PostMapping("/search")
    public String searchProcess(@RequestParam("lastname") String lastname, Model model){
        model.addAttribute("customers", customerRepository.findByLastName(lastname));
        return "customer";
    }
}
