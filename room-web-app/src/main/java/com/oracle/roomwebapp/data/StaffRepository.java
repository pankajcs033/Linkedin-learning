package com.oracle.roomwebapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oracle.roomwebapp.models.StaffMember;

public interface StaffRepository extends JpaRepository<StaffMember, String>{
    
}
