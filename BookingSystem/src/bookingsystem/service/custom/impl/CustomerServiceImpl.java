/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.service.custom.impl;

import bookingsystem.dao.DaoFactory;
import bookingsystem.dao.custom.CustomerDao;
import bookingsystem.dto.CustomerDto;
import bookingsystem.entity.CustomerEntity;
import bookingsystem.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class CustomerServiceImpl implements CustomerService{
    
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public String saveCustomer(CustomerDto dto) throws Exception {
        // Make the entity from the dto
        CustomerEntity customerEntity = new CustomerEntity(dto.getCustId(), dto.getCustname(), dto.getCustdob(), dto.getCustsalary(), dto.getCustaddress());
        // send the entity
        
        if (customerDao.save(customerEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

   @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getCustId(),
                dto.getCustname(), dto.getCustdob(),
                dto.getCustsalary(), dto.getCustaddress());

        if (customerDao.update(customerEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if (customerDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        if (entity != null) {
            return new CustomerDto(entity.getCustId(),
                    entity.getCustname(), entity.getCustdob(),
                    entity.getCustsalary(), entity.getCustaddress());
        }
        return null;
    }


    @Override
    public ArrayList<CustomerDto> getAll() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntities = customerDao.getAll();
        for (CustomerEntity entity : customerEntities) {
            customerDtos.add(new CustomerDto(entity.getCustId(),
                    entity.getCustname(), entity.getCustdob(),
                    entity.getCustsalary(), entity.getCustaddress()));
        }
        return customerDtos;
    }  
}