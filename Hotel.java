package com.hote;

import java.util.ArrayList;
import java.util.List;

class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel() {
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
        // Add some rooms for the example
        rooms.add(new Room(101, "Single", 100.0));
        rooms.add(new Room(102, "Double", 150.0));
        rooms.add(new Room(103, "Suite", 200.0));
    }

    public List<Room> searchAvailableRooms(String type) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public Reservation makeReservation(String user, int roomNumber, String checkInDate, String checkOutDate) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                Reservation reservation = new Reservation(room, user, checkInDate, checkOutDate);
                reservations.add(reservation);
                processPayment(room.getPrice());
                return reservation;
            }
        }
        System.out.println("Room not available for reservation.");
        return null;
    }

    public void viewReservations() {
        for (Reservation reservation : reservations) {
            reservation.displayReservation();
            System.out.println();
        }
    }

    private void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + "...");
        System.out.println("Payment successful.");
    }
}
