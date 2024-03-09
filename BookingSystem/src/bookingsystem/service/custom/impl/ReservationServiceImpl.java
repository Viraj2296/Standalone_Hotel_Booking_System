/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingsystem.service.custom.impl;

import bookingsystem.dao.DaoFactory;
import bookingsystem.dao.custom.ReservationDao;
import bookingsystem.dao.custom.ReservationItemDao;
import bookingsystem.db.DBConnection;
import bookingsystem.dto.ReservationDto;
import bookingsystem.dto.ReservationItemDto;
import bookingsystem.entity.ReservationEntity;
import bookingsystem.entity.ReservationItemEntity;
import bookingsystem.service.custom.ReservationService;
// import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;

/**
 *
 * @author Dell
 */

public class ReservationServiceImpl implements ReservationService {
    
    private ReservationDao reservationDao = (ReservationDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.RESERVATION);
    private ReservationItemDao reservationItemDao = (ReservationItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.RESERVATIONITEM);
//    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);

    @Override
    public String placeOrder(ReservationDto dto) throws Exception {
    Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            ReservationEntity reservationEntity = new ReservationEntity(dto.getReservationID(),dto.getBookingDate(),dto.getCustID(),dto.getPackageID());
            if(reservationDao.save(reservationEntity)){
                boolean isSavedOrderDetail = true;
                for (ReservationItemDto reservationItemDto : dto.getReservationitemDtos()) {
                    ReservationItemEntity reservationitemEntity = new ReservationItemEntity(reservationItemDto.getRoomID(),reservationItemDto.getCheckIn(),reservationItemDto.getCheckOut(),dto.getReservationID());
                    if(!reservationItemDao.save(reservationitemEntity)){
                        isSavedOrderDetail = false;
                    }
                }
                return "Successfully Saved";
//                if(isSavedOrderDetail){
//                    boolean isItemUpdated = true;
//                    
//                    for (OrderDetailDto orderDetailDto : dto.getOrderDetailDtos()) {
//                        ItemEntity itemEntity = itemDao.get(orderDetailDto.getItemId());
//                        itemEntity.setQoh(itemEntity.getQoh() - orderDetailDto.getQty());
//                        if(!itemDao.update(itemEntity)){
//                            isItemUpdated = false;
//                        }
//                    }                    
//                    if(isItemUpdated){
//                        connection.commit();
//                        return "Successfully Saved";
//                    } else {
//                        connection.rollback();
//                    return "Error in item update";
//                    }                   
//                } else{
//                    connection.rollback();
//                    return "Error in order detail save";
//                }                
            } else {
                connection.rollback();
                return "Error in order save";
            }            
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();
        } finally {
            connection.setAutoCommit(true);
        }    
    }
}