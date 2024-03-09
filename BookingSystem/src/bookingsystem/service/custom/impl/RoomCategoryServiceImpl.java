/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.service.custom.impl;

import bookingsystem.dao.DaoFactory;
import bookingsystem.dao.custom.RoomCategoryDao;
import bookingsystem.dto.RoomCategoryDto;
import bookingsystem.entity.CustomerEntity;
import bookingsystem.entity.RoomCategoryEntity;
import bookingsystem.service.custom.RoomCategoryService;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */

public class RoomCategoryServiceImpl implements RoomCategoryService{
    private RoomCategoryDao roomcategorydao = (RoomCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOMCATEGORY);

    @Override
    public String saveCategory(RoomCategoryDto dto) throws Exception {
        RoomCategoryEntity entity = new RoomCategoryEntity(dto.getCategoryid(),
                dto.getRoomcategory(), dto.getRate());
        if (roomcategorydao.save(entity)) {
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateCategory(RoomCategoryDto dto) throws Exception {
        RoomCategoryEntity customerEntity = new RoomCategoryEntity(dto.getCategoryid(),dto.getRoomcategory(),dto.getRate());
        if (roomcategorydao.update(customerEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCategory(String id) throws Exception {
        if (roomcategorydao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }    
    }

    @Override
    public RoomCategoryDto getCategory(String id) throws Exception {
        RoomCategoryEntity entity = roomcategorydao.get(id);
        if (entity != null) {
            return new RoomCategoryDto(entity.getCategoryId(),entity.getRoomCategory(),entity.getRate());
        }
        return null;
    }

    @Override
    public ArrayList<RoomCategoryDto> getAll() throws Exception {
        ArrayList<RoomCategoryDto> roomcategoryDtos = new ArrayList<>();
        ArrayList<RoomCategoryEntity> roomcategoryEntities = roomcategorydao.getAll();
        for (RoomCategoryEntity entity : roomcategoryEntities) {
            roomcategoryDtos.add(new RoomCategoryDto(entity.getCategoryId(),entity.getRoomCategory(),entity.getRate()));
        }
        return roomcategoryDtos;
    }
}