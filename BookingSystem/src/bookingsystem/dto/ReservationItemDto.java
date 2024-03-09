/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dto;

/**
 *
 * @author Dell
 */
public class ReservationItemDto {
    private String RoomID;
    private String CheckIn;
    private String CheckOut;
    private String ReservationID;

    public ReservationItemDto() {
    }

    public ReservationItemDto(String RoomID, String CheckIn, String CheckOut, String ReservationID) {
        this.RoomID = RoomID;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
        this.ReservationID = ReservationID;
    }

    /**
     * @return the RoomID
     */
    public String getRoomID() {
        return RoomID;
    }

    /**
     * @param RoomID the RoomID to set
     */
    public void setRoomID(String RoomID) {
        this.RoomID = RoomID;
    }

    /**
     * @return the CheckIn
     */
    public String getCheckIn() {
        return CheckIn;
    }

    /**
     * @param CheckIn the CheckIn to set
     */
    public void setCheckIn(String CheckIn) {
        this.CheckIn = CheckIn;
    }

    /**
     * @return the CheckOut
     */
    public String getCheckOut() {
        return CheckOut;
    }

    /**
     * @param CheckOut the CheckOut to set
     */
    public void setCheckOut(String CheckOut) {
        this.CheckOut = CheckOut;
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

    @Override
    public String toString() {
        return "ReservationItemDto{" + "RoomID=" + RoomID + ", CheckIn=" + CheckIn + ", CheckOut=" + CheckOut + ", ReservationID=" + ReservationID + '}';
    }
}