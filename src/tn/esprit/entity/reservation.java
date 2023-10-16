/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.entity;

import java.sql.Date;

/**
 *
 * @author amadd
 */
public class reservation {
    private int id;
    private int transportId; // Assuming you associate reservations with a specific transport
    private String customerName;
    private Date reservationDate;
    private int seatNumber;
    private boolean confirmed;

    public int getId() {
        return id;
    }

    public int getTransportId() {
        return transportId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public reservation() {
    }

    public reservation(int id, int transportId, String customerName, Date reservationDate, int seatNumber, boolean confirmed) {
        this.id = id;
        this.transportId = transportId;
        this.customerName = customerName;
        this.reservationDate = reservationDate;
        this.seatNumber = seatNumber;
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        return "reservation{" + "id=" + id + ", transportId=" + transportId + ", customerName=" + customerName + ", reservationDate=" + reservationDate + ", seatNumber=" + seatNumber + ", confirmed=" + confirmed + '}';
    }
    
    
    
}
