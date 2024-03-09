/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dao.custom.impl;

import bookingsystem.dao.CrudUtil;
import bookingsystem.dao.custom.ReservationItemDao;
import bookingsystem.entity.ReservationItemEntity;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ReservationItemDaoImpl implements ReservationItemDao {

    @Override
    public boolean save(ReservationItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO ReservationItem VALUES(?,?,?,?)", 
                t.getRoomID(),
                t.getCheckIn(),
                t.getCheckOut(),
                t.getReservationID());    
    }

    @Override
    public boolean update(ReservationItemEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ReservationItemEntity get(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ReservationItemEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 
}