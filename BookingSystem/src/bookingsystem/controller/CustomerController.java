/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.controller;

import bookingsystem.dto.CustomerDto;
import bookingsystem.service.ServiceFactory;
import bookingsystem.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */

public class CustomerController {

    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String save(CustomerDto customerDto) throws Exception{
        return customerService.saveCustomer(customerDto);
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }
    
    public String deleteCustomer(String id) throws Exception{
        return customerService.deleteCustomer(id);
    }
    
    public CustomerDto getCustomer(String id) throws Exception{
        return customerService.getCustomer(id);
    }
    
    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        return customerService.getAll();
    }
}