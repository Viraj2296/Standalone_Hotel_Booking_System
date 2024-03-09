/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.controller;

import bookingsystem.dto.ReservationDto;
import bookingsystem.service.ServiceFactory;
import bookingsystem.service.custom.ReservationService;

/**
 *
 * @author Dell
 */

public class ReservationController {
    private ReservationService reservationService = (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);
    
    public String placeOrder(ReservationDto reservationDto) throws Exception{
        return reservationService.placeOrder(reservationDto);
    }
}