package project.gym.services;

import java.util.List;

import project.gym.pojos.Booking;

public interface IBookingService {
	Booking getBookingById(Long bookingId);

    List<Booking> getAllBookings();

    Booking saveBooking(Booking booking);

    void deleteBooking(Long bookingId);
}
