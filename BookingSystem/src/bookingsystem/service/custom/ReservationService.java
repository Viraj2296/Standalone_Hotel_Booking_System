/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bookingsystem.service.custom;

import bookingsystem.dto.ReservationDto;
import bookingsystem.service.Superservice;

/**
 *
 * @author Dell
 */
public interface ReservationService extends Superservice {
    String placeOrder(ReservationDto dto) throws Exception;
}