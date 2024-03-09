/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dao.custom.impl;

import bookingsystem.dao.CrudUtil;
import bookingsystem.dao.custom.RoomDao;
import bookingsystem.entity.RoomEntity;
import java.util.ArrayList;
import java.sql.ResultSet;


/**
 *
 * @author Dell
 */
public class RoomDaoImpl implements RoomDao {

    @Override
    public boolean save(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Room VALUES (?,?,?,?)",
            t.getRoomID(),
            t.getFloorNo(),
            t.getDoorNo(),
            t.getCategoryId());
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Room SET FloorNo=?, DoorNo=?, "
                + "CategoryId=?"
                + "WHERE RoomID=?",
                t.getFloorNo(),
                t.getDoorNo(),
                t.getCategoryId(),
                t.getRoomID());    
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Room WHERE RoomID=?", id);
    }

    @Override
    public RoomEntity get(String id) throws Exception {
//        System.out.println(id);
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Room WHERE RoomID = ?", id);
        while (rst.next()) {
            return new RoomEntity(
                    rst.getString("RoomID"),
                    rst.getInt("FloorNo"),
                    rst.getInt("DoorNo"),
                    rst.getString("CategoryId"));
        }
        return null;
    }

    @Override
    public ArrayList<RoomEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Room");
        ArrayList<RoomEntity> roomEntities = new ArrayList<>();
        while (rst.next()) {
            roomEntities.add(new RoomEntity(
                rst.getString("RoomID"),
                rst.getInt("FloorNo"),
                rst.getInt("DoorNo"),
                rst.getString("CategoryId")
            ));
        }
        return roomEntities;    
    }
}