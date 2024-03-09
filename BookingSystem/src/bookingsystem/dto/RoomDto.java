/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dto;

/**
 *
 * @author Dell
 */
public class RoomDto {
    private String categoryid;
    private String roomid;
    private Integer floorno;
    private Integer doorno;
    
    public RoomDto(){
    }

    public RoomDto(String categoryid, String roomid, Integer floorno, Integer doorno) {
        this.categoryid = categoryid;
        this.roomid = roomid;
        this.floorno = floorno;
        this.doorno = doorno;
    }

    /**
     * @return the categoryid
     */
    public String getCategoryid() {
        return categoryid;
    }

    /**
     * @param categoryid the categoryid to set
     */
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * @return the roomid
     */
    public String getRoomid() {
        return roomid;
    }

    /**
     * @param roomid the roomid to set
     */
    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    /**
     * @return the floorno
     */
    public Integer getFloorno() {
        return floorno;
    }

    /**
     * @param floorno the floorno to set
     */
    public void setFloorno(Integer floorno) {
        this.floorno = floorno;
    }

    /**
     * @return the doorno
     */
    public Integer getDoorno() {
        return doorno;
    }

    /**
     * @param doorno the doorno to set
     */
    public void setDoorno(Integer doorno) {
        this.doorno = doorno;
    }

    /**
     * @return the reservationid
     */


    @Override
    public String toString() {
        return "RoomDto{" + "categoryid=" + categoryid + ", roomid=" + roomid + ", floorno=" + floorno + ", doorno=" + doorno + '}';
    }
}