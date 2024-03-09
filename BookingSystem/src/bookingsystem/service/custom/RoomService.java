/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.service.custom;

import bookingsystem.dto.RoomDto;
import bookingsystem.service.Superservice;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public interface RoomService extends Superservice {
    
    String addRoom(RoomDto dto) throws Exception;

    String updateRoom(RoomDto dto) throws Exception;

    String deleteRoom(String id) throws Exception;
    
    RoomDto getRoom(String id) throws Exception;
    
    ArrayList<RoomDto> getAll() throws Exception;
}
