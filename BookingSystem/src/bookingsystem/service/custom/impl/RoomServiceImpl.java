/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.service.custom.impl;

import bookingsystem.dao.DaoFactory;
import bookingsystem.dao.custom.RoomDao;
import bookingsystem.dto.RoomDto;
import bookingsystem.entity.RoomEntity;
import bookingsystem.service.custom.RoomService;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RoomServiceImpl implements RoomService  {
    
    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOM);
    
    @Override
    public String addRoom(RoomDto dto) throws Exception {
        // Make the entity by the DTO values
        RoomEntity roomEntity = new RoomEntity(dto.getRoomid(),dto.getFloorno(),dto.getDoorno(),dto.getCategoryid());
        if (roomDao.save(roomEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateRoom(RoomDto dto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(dto.getRoomid(),dto.getFloorno(),dto.getDoorno(),dto.getCategoryid());
        if (roomDao.update(roomEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }    }

    @Override
    public String deleteRoom(String id) throws Exception {
        if (roomDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public RoomDto getRoom(String id) throws Exception {
         RoomEntity entity = roomDao.get(id);
        if (entity != null) {
            return new RoomDto(entity.getCategoryId(),entity.getRoomID(),entity.getFloorNo(),entity.getDoorNo());
        }
        return null;
    }

    @Override
    public ArrayList<RoomDto> getAll() throws Exception {
        ArrayList<RoomDto> roomDtos = new ArrayList<>();
        ArrayList<RoomEntity> customerEntities = roomDao.getAll();
        for (RoomEntity entity : customerEntities) {
            roomDtos.add(new RoomDto(entity.getCategoryId(),entity.getRoomID(),entity.getFloorNo(),entity.getDoorNo()));
        }
        return roomDtos;
    }
}