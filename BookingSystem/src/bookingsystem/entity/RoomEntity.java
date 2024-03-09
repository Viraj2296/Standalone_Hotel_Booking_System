/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.entity;

/**
 *
 * @author Dell
 */
public class RoomEntity {
    private String RoomID;
    private Integer FloorNo;
    private Integer DoorNo;
    private String CategoryId;

    public RoomEntity(){
    }

    public RoomEntity(String RoomID, Integer FloorNo, Integer DoorNo, String CategoryId) {
        this.RoomID = RoomID;
        this.FloorNo = FloorNo;
        this.DoorNo = DoorNo;
        this.CategoryId = CategoryId;
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
     * @return the FloorNo
     */
    public Integer getFloorNo() {
        return FloorNo;
    }

    /**
     * @param FloorNo the FloorNo to set
     */
    public void setFloorNo(Integer FloorNo) {
        this.FloorNo = FloorNo;
    }

    /**
     * @return the DoorNo
     */
    public Integer getDoorNo() {
        return DoorNo;
    }

    /**
     * @param DoorNo the DoorNo to set
     */
    public void setDoorNo(Integer DoorNo) {
        this.DoorNo = DoorNo;
    }

    /**
     * @return the CategoryId
     */
    public String getCategoryId() {
        return CategoryId;
    }

    /**
     * @param CategoryId the CategoryId to set
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * @return the ReservationID
     */

    @Override
    public String toString() {
        return "RoomEntity{" + "RoomID=" + RoomID + ", FloorNo=" + FloorNo + ", DoorNo=" + DoorNo + ", CategoryId=" + CategoryId + '}';
    }
}