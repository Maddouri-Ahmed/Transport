/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.Services;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tn.esprit.entity.Transport;
import tn.esprit.entity.reservation;
import tn.esprit.tools.MyDB;

/**
 *
 * @author amadd
 */
    public class servicereservation implements IServicer<reservation> {
        
        public servicereservation () {                                
            
        
    }
        @Override
    public void addreservation(reservation r) {
        try {
            String sql = "INSERT INTO reservation (id, transportId, customerName, reservationDate, seatNumber, confirmed) VALUES (?,?,?,?,?,?)";
            PreparedStatement pre = MyDB.getInstance().getCon().prepareStatement(sql);
            pre.setInt(1, r.getId());
            pre.setInt(2, r.getTransportId());
            pre.setString(3, r.getCustomerName());
            pre.setDate(4, r.getReservationDate());
            pre.setInt(5, r.getSeatNumber());
            pre.setBoolean(6, r.isConfirmed());
            pre.executeUpdate();
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param reservation
     */
    @Override
    public void updatereservation(reservation r) {
        try {
            String sql = "UPDATE reservation SET transportId = ?, customerName = ?, reservationDate = ?, seatNumber = ?, confirmed = ? WHERE id = ?";
            PreparedStatement pre = MyDB.getInstance().getCon().prepareStatement(sql);
            pre.setInt(1, r.getId());
            pre.setInt(2, r.getTransportId());
            pre.setString(3, r.getCustomerName());
            pre.setDate(4, r.getReservationDate());
            pre.setInt(5, r.getSeatNumber());
            pre.setBoolean(6, r.isConfirmed());
            pre.executeUpdate();
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletereservation(int id) {
        try {
            String sql = "DELETE FROM reservation WHERE id = ?";
            PreparedStatement pre = MyDB.getInstance().getCon().prepareStatement(sql);
            pre.setInt(1, id);
            pre.executeUpdate();
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<reservation> getAllreservation() {
        List<reservation> reservation = new ArrayList<>();

        try {
            String sql = "SELECT * FROM reservation";
            Statement stmt =MyDB.getInstance().getCon().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                int transportId = rs.getInt("transportId");
                String customerName = rs.getString("customerName");
                Date reservationDate  = rs.getDate("reservationDate");
                int seatNumber = rs.getInt("seatNumber");
                boolean confirmed = rs.getBoolean("confirmed");
                reservation.add(new reservation(id, transportId, customerName, reservationDate, seatNumber, confirmed));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservation;
    }

 

    
    }

  

        


