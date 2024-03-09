/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dao.custom.impl;

import bookingsystem.dao.CrudUtil;
import bookingsystem.dao.custom.RoomCategoryDao;
import bookingsystem.entity.CustomerEntity;
import bookingsystem.entity.RoomCategoryEntity;
import java.awt.List;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class RoomCategoryDaoImpl implements RoomCategoryDao {
    @Override
    public boolean save(RoomCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Category VALUES (?,?,?)",
                t.getCategoryId(),
                t.getRoomCategory(),
                t.getRate());
    }

@Override
public boolean update(RoomCategoryEntity t) throws Exception {
    return CrudUtil.executeUpdate("UPDATE Category SET RoomCategory=?, Rate=? WHERE CategoryId=?",
            t.getRoomCategory(),
            t.getRate(),
            t.getCategoryId());
}

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Category WHERE CategoryId=?", id);
    }

    @Override
    public RoomCategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Category WHERE CategoryId = ?", id);
        while (rst.next()) {
            return new RoomCategoryEntity(
                    rst.getString("CategoryId"),
                    rst.getString("RoomCategory"),
                    rst.getInt("Rate"));
        }
        return null;
    }

    @Override
    public ArrayList<RoomCategoryEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Category");
        ArrayList<RoomCategoryEntity> roomcategoryEntities = new ArrayList<>();
        
        while (rst.next()) {
            roomcategoryEntities.add(new RoomCategoryEntity(
                    rst.getString("CategoryId"),
                    rst.getString("RoomCategory"),
                    rst.getInt("Rate")));
        }
        return roomcategoryEntities;
    }
}