package com.oracle.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.roomwebapp.models.StaffMember;
import com.oracle.roomwebapp.service.staffService;

@RestController
@RequestMapping("/api/staff")
class staffRestController {
    private final staffService staffService;

    public staffRestController(staffService staffService){
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllRooms(){
        return staffService.getAllStaff();
    }
}