/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem;

import bookingsystem.view.CustomerView;
import bookingsystem.view.ManageRoomsCategoriesView;
import bookingsystem.view.ManageRoomsView;
import bookingsystem.view.ReservationView;
import bookingsystem.view.loginvie;

/**
 *
 * @author Dell
 */

public class Main {
    private static loginvie loginView;

    public static void main(String[] args){
        loginView = new loginvie();
        loginView.setVisible(true);
        // Call other views as needed
    }
    
    public static void displayall(){
        if (loginView != null) {
            loginView.setVisible(false);
        }
        new CustomerView().setVisible(true);
        new ManageRoomsCategoriesView().setVisible(true);
        new ManageRoomsView().setVisible(true);
        new ReservationView().setVisible(true);
    }
}