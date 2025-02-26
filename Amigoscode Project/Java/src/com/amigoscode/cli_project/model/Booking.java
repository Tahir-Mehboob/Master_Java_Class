package com.amigoscode.cli_project.model;

import java.util.Objects;

public class Booking {

    // fields
    private int bookingID;
    private boolean isCanceled;
    private String bookingDate;
    private Users user;
    private Cars car;

    // constructor
    public Booking() {}

    public Booking(int bookingID, boolean isCanceled, String bookingDate, Users user, Cars car) {
        this.bookingID = bookingID;
        this.isCanceled = isCanceled;
        this.bookingDate = bookingDate;
        this.user = user;
        this.car = car;
    }

    // getter and setter
    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingID == booking.bookingID && isCanceled == booking.isCanceled && Objects.equals(bookingDate, booking.bookingDate) && Objects.equals(user, booking.user) && Objects.equals(car, booking.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingID, isCanceled, bookingDate, user, car);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", isCanceled=" + isCanceled +
                ", bookingDate='" + bookingDate + '\'' +
                ", user=" + user +
                ", car=" + car +
                '}';
    }
}
