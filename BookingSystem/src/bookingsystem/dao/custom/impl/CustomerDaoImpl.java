/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dao.custom.impl;

import bookingsystem.dao.CrudUtil;
import bookingsystem.dao.custom.CustomerDao;
import bookingsystem.entity.CustomerEntity;
import java.util.ArrayList;

import java.sql.ResultSet;
/**
 *
 * @author Dell
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean save(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES (?,?,?,?,?)",
                t.getCustId(),
                t.getCustname(),
                t.getCustdob(),
                t.getCustsalary(),
                t.getCustaddress());
    }
    
    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET CustName=?,DOB=?, salary=?, CustAddress=? WHERE CustID=?",
                t.getCustname(),
                t.getCustdob(),
                t.getCustsalary(),
                t.getCustaddress(),
                t.getCustId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE CustID=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE CustID = ?", id);
        while (rst.next()) {
            return new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getDouble("salary"),
                    rst.getString("CustAddress"));
            }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<CustomerEntity> customerEntities = new ArrayList<>();
        while (rst.next()) {
            customerEntities.add(new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getDouble("salary"),
                    rst.getString("CustAddress")));
        }  
        return customerEntities;
    }
}