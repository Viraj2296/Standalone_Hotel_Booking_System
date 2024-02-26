/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dao;

import bookingsystem.dao.custom.impl.CustomerDaoImpl;

/**
 *
 * @author Dell
 */
public class DaoFactory {
     private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoType type) {
        switch (type) {
            // case ITEM:
                // return null;
                //return new ItemDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            // case ORDER:
                //return new OrderDaoImpl();
                //return null;
            // case ORDER_DETAIL:
                //return null;
                //return new OrderDetailDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoType {
       CUSTOMER
    }
}
