/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.service;

import bookingsystem.service.custom.impl.CustomerServiceImpl;

/**
 *
 * @author Dell
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
    public Superservice getService(ServiceType type){
        switch (type) {
            // case ITEM:
                // return null;
                //return new ItemServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            // case ORDER:
                // return null;
                //return new OrderServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        CUSTOMER
    }
}
