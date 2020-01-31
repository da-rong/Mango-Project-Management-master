package com.mangoprojectmanagement.controller;

import com.mangoprojectmanagement.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/profiles")
public class ProfileController {

    private ProfileService profileService;

    @Autowired
    public EmployeeAndProjectController(ProfileService theProfileService) {

        profileService = theProfileService;
    }

    // add mapping for "/list"

    @GetMapping("/list")
    public String listProfiles(Model theModel) {

        // get employees from db
        List<Profile> theProfiles = profileService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theProfiles);

        return "list-profiles";
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/add")
    public String addProfile(@ModelAttribute("profile") Profile theProfile) {

        // save the profile
        profileService.add(theProfile);

        // return theProfile

        return "newProfile";
    }



}



