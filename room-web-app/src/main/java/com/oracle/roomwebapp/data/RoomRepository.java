package com.oracle.roomwebapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oracle.roomwebapp.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
}
