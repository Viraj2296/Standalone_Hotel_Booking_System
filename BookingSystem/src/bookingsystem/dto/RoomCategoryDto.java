/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.dto;

/**
 *
 * @author Dell
 */
public class RoomCategoryDto {
    private String categoryid;
    private String roomcategory;
    private Integer rate;

    public RoomCategoryDto(){
    }
    
    public RoomCategoryDto(String categoryid, String roomcategory, Integer rate){
        this.categoryid = categoryid;
        this.roomcategory = roomcategory;
        this.rate = rate;
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
     * @return the roomcategory
     */
    public String getRoomcategory() {
        return roomcategory;
    }

    /**
     * @param roomcategory the roomcategory to set
     */
    public void setRoomcategory(String roomcategory) {
        this.roomcategory = roomcategory;
    }

    /**
     * @return the rate
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "RoomCategoryDto{" + "categoryid=" + categoryid + ", roomcategory=" + roomcategory + ", rate=" + rate + '}';
    }
}