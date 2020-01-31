package com.mangoprojectmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/profiles")
public class EmployeeAndProjectController {

    private EmployeeAndProjectService employeeAndProjectService;

    @Autowired
    public EmployeeAndProjectController(EmployeeAndProjectService theEmployeeAndProjectService) {

        employeeAndProjectService = theEmployeeAndProjectService;
    }

    // add mapping for "/list" 

    @GetMapping("/list")
    public String listProfiles(Model theModel) {

        // get employees from db
        List<Profile> theProfiles = employeeAndProjectService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theProfiles);

        return "list-profiles";
    }

    // add mapping for POST /employees - add new employee

     @PostMapping("/add")
     public Employee addProfile(@ModelAttribute("profile") Profile theProfile) {

        // save the profile
        employeeAndProjectService.add(theProfile);

        // return theProfile

        return "newProfile";
        // return "redirect:/employees/list";
     }

}
