/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem;

import bookingsystem.view.CustomerView;
import bookingsystem.view.LoginView;
import bookingsystem.view.ManageRoomsCategoriesView;
import bookingsystem.view.ManageRoomsView;
import bookingsystem.view.ReservationView;

/**
 *
 * @author Dell
 */

public class Main {
    public static void main(String[] args){
        new CustomerView().setVisible(true);
        new LoginView().setVisible(true);
        new ManageRoomsCategoriesView().setVisible(true);
        new ManageRoomsView().setVisible(true);
        new ReservationView().setVisible(true);
    }
}