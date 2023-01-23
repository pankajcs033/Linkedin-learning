package com.oracle.roomwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.roomwebapp.models.StaffMember;
import com.oracle.roomwebapp.data.StaffRepository;

@Service
public class staffService {
    public final StaffRepository staffRepository;

    
    public staffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }


    public List<StaffMember> getAllStaff() {
        return staffRepository.findAll();
    }

}
