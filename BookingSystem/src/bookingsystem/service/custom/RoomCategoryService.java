/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.service.custom;

import bookingsystem.dto.CustomerDto;
import bookingsystem.dto.RoomCategoryDto;
import java.util.ArrayList;
import bookingsystem.service.Superservice;
/**
 *
 * @author Dell
 */

public interface RoomCategoryService extends Superservice{
    String saveCategory(RoomCategoryDto dto) throws Exception;

    String updateCategory(RoomCategoryDto dto) throws Exception;

    String deleteCategory(String id) throws Exception;
    
    RoomCategoryDto getCategory(String id) throws Exception;
    
    ArrayList<RoomCategoryDto> getAll() throws Exception;
}