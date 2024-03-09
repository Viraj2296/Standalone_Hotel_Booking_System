/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bookingsystem.service.custom;

import bookingsystem.dto.CustomerDto;
import bookingsystem.service.Superservice;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */

public interface CustomerService extends Superservice {
    String saveCustomer(CustomerDto dto) throws Exception;

    String updateCustomer(CustomerDto dto) throws Exception;

    String deleteCustomer(String id) throws Exception;
    
    CustomerDto getCustomer(String id) throws Exception;
    
    ArrayList<CustomerDto> getAll() throws Exception;
}