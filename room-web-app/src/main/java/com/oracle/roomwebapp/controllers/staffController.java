package com.oracle.roomwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.roomwebapp.service.staffService;


@Controller
@RequestMapping("/staff")
public class staffController {
    private final staffService staffService;

    public staffController(staffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String allStaff(Model model){
        model.addAttribute("staff", staffService.getAllStaff());
        return "staff";
    }
}
