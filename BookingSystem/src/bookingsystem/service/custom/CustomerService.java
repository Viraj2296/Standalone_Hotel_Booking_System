/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bookingsystem.service.custom;

import bookingsystem.dto.CustomerDto;
import java.awt.List;

/**
 *
 * @author Dell
 */
public interface CustomerService {
    String addCustomer(CustomerDto dto) throws Exception;

    String updateCustomer(CustomerDto dto) throws Exception;

    String deleteCustomer(String id) throws Exception;
    
    CustomerDto getCustomer(String id) throws Exception;
    
    List<CustomerDto> getAll() throws Exception;
}
