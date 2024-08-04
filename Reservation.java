package com.hote;

public class Reservation {
    private Room room;
    private String user;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(Room room, String user, String checkInDate, String checkOutDate) {
        this.room = room;
        this.user = user;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room.setAvailable(false);
    }

    public Room getRoom() {
        return room;
    }

    public String getUser() {
        return user;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void displayReservation() {
        System.out.println("Reservation Details:");
        System.out.println("User: " + user);
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getPrice());
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Total Cost: $" + room.getPrice());
    }
}
