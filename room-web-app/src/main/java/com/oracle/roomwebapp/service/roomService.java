package com.oracle.roomwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.roomwebapp.data.RoomRepository;
import com.oracle.roomwebapp.models.Room;

@Service
public class roomService {
    public final RoomRepository roomRepository;

    
    public roomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
