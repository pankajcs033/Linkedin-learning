package com.oracle.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.roomwebapp.models.Room;
import com.oracle.roomwebapp.service.roomService;

@RestController
@RequestMapping("/api/rooms")
class roomRestController {
    private final roomService roomService;

    public roomRestController(roomService roomService){
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
}