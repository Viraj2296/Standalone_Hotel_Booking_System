/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.controller;

import bookingsystem.dto.CustomerDto;
import bookingsystem.service.ServiceFactory;
import bookingsystem.service.custom.CustomerService;

/**
 *
 * @author Dell
 */
public class CustomerController {

    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String save(CustomerDto customerDto) throws Exception{
        return customerService.saveCustomer(customerDto);
    } 
}