package com.bridgelabz.hotelreservationprogram;

import java.util.ArrayList;

public class HotelReservation {

	public void addHotelDetails() {
		ArrayList<HotelDetails> hotelList = new ArrayList<>();
		hotelList.add(new HotelDetails("Lakewood", 110));
		hotelList.add(new HotelDetails("Bridgewood", 160));
		hotelList.add(new HotelDetails("Ridgewood", 220));
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program.");
		HotelReservation hotel = new HotelReservation();
		hotel.addHotelDetails();

	}
}
