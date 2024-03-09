/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.entity;

/**
 *
 * @author Dell
 */
public class RoomCategoryEntity {
    private String CategoryId;
    private String RoomCategory;
    private Integer Rate;
    
    public RoomCategoryEntity(){
    }
    
    public RoomCategoryEntity(String CategoryId, String RoomCategory, Integer Rate){
        this.CategoryId = CategoryId;
        this.RoomCategory = RoomCategory;
        this.Rate = Rate;
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
     * @return the RoomCategory
     */
    public String getRoomCategory() {
        return RoomCategory;
    }

    /**
     * @param RoomCategory the RoomCategory to set
     */
    public void setRoomCategory(String RoomCategory) {
        this.RoomCategory = RoomCategory;
    }

    /**
     * @return the Rate
     */
    public Integer getRate() {
        return Rate;
    }

    /**
     * @param Rate the Rate to set
     */
    public void setRate(Integer Rate) {
        this.Rate = Rate;
    }

    @Override
    public String toString() {
        return "RoomCategory{" + "CategoryId=" + CategoryId + ", RoomCategory=" + RoomCategory + ", Rate=" + Rate + '}';
    }
}