/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.controller;

import bookingsystem.dto.CustomerDto;
import bookingsystem.dto.RoomCategoryDto;
import bookingsystem.service.ServiceFactory;
import bookingsystem.service.custom.RoomCategoryService;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */

public class RoomCategoryController {
   private RoomCategoryService roomcategoryService = (RoomCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMCATEGORY);

    public String addcategory(RoomCategoryDto roomcategoryDto) throws Exception{
        return roomcategoryService.saveCategory(roomcategoryDto);
    }
    
    public String updateCustomer(RoomCategoryDto roomcategoryDto) throws Exception{
        return roomcategoryService.updateCategory(roomcategoryDto);
    }
    
    public String deleteCustomer(String id) throws Exception{
        return roomcategoryService.deleteCategory(id);
    }
    
    public RoomCategoryDto getCategory(String id) throws Exception{
        return roomcategoryService.getCategory(id);
    }
    
    public ArrayList<RoomCategoryDto> getAllCategories() throws Exception{
        return roomcategoryService.getAll();
    } 
}