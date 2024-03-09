/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.entity;

/**
 *
 * @author Dell
 */
public class ReservationEntity {
    private String ReservationID;
    private String BookingDate;
    private String CustID;
    private String PackageID;

    public ReservationEntity() {
    }

    public ReservationEntity(String ReservationID, String BookingDate, String CustID, String PackageID) {
        this.ReservationID = ReservationID;
        this.BookingDate = BookingDate;
        this.CustID = CustID;
        this.PackageID = PackageID;
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

    @Override
    public String toString() {
        return "ReservationEntity{" + "ReservationID=" + ReservationID + ", BookingDate=" + BookingDate + ", CustID=" + CustID + ", PackageID=" + PackageID + '}';
    }
}