package com.hote;

import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Hotel hotel = new Hotel();

	        while (true) {
	            System.out.println("Hotel Reservation System");
	            System.out.println("1. Search for available rooms");
	            System.out.println("2. Make a reservation");
	            System.out.println("3. View reservations");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter room type (Single/Double/Suite): ");
	                    String type = scanner.nextLine();
	                    List<Room> availableRooms = hotel.searchAvailableRooms(type);
	                    if (availableRooms.isEmpty()) {
	                        System.out.println("No available rooms of type: " + type);
	                    } else {
	                        System.out.println("Available Rooms:");
	                        for (Room room : availableRooms) {
	                            System.out.println("Room Number: " + room.getRoomNumber() + ", Price: $" + room.getPrice());
	                        }
	                    }
	                    break;
	                case 2:
	                    System.out.print("Enter your name: ");
	                    String user = scanner.nextLine();
	                    System.out.print("Enter room number: ");
	                    int roomNumber = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter check-in date (YYYY-MM-DD): ");
	                    String checkInDate = scanner.nextLine();
	                    System.out.print("Enter check-out date (YYYY-MM-DD): ");
	                    String checkOutDate = scanner.nextLine();
	                    Reservation reservation = hotel.makeReservation(user, roomNumber, checkInDate, checkOutDate);
	                    if (reservation != null) {
	                        reservation.displayReservation();
	                    }
	                    break;
	                case 3:
	                    hotel.viewReservations();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    
	        
	    }
}
	    

