/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dto;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ReservationDto {
    private String ReservationID;
    private String BookingDate;
    private String CustID;
    private String PackageID;
    private ArrayList<ReservationItemDto> reservationitemDtos;

    public ReservationDto() {
    }

    public ReservationDto(String ReservationID, String BookingDate, String CustID, String PackageID, ArrayList<ReservationItemDto> reservationitemDtos) {
        this.ReservationID = ReservationID;
        this.BookingDate = BookingDate;
        this.CustID = CustID;
        this.PackageID = PackageID;
        this.reservationitemDtos = reservationitemDtos;
    }

    /**
     * @return the ReservationID
     */
    public String getReservationID() {
        return ReservationID;
    }

    /**
     * @param ReservationID the ReservationID to set
     */
    public void setReservationID(String ReservationID) {
        this.ReservationID = ReservationID;
    }

    /**
     * @return the BookingDate
     */
    public String getBookingDate() {
        return BookingDate;
    }

    /**
     * @param BookingDate the BookingDate to set
     */
    public void setBookingDate(String BookingDate) {
        this.BookingDate = BookingDate;
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the PackageID
     */
    public String getPackageID() {
        return PackageID;
    }

    /**
     * @param PackageID the PackageID to set
     */
    public void setPackageID(String PackageID) {
        this.PackageID = PackageID;
    }

    /**
     * @return the reservationitemDtos
     */
    public ArrayList<ReservationItemDto> getReservationitemDtos() {
        return reservationitemDtos;
    }

    /**
     * @param reservationitemDtos the reservationitemDtos to set
     */
    public void setReservationitemDtos(ArrayList<ReservationItemDto> reservationitemDtos) {
        this.reservationitemDtos = reservationitemDtos;
    }

    @Override
    public String toString() {
        return "ReservationDto{" + "ReservationID=" + ReservationID + ", BookingDate=" + BookingDate + ", CustID=" + CustID + ", PackageID=" + PackageID + ", reservationitemDtos=" + reservationitemDtos + '}';
    }
}