package project.gym.services;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import project.gym.dao.IBooking;
import project.gym.pojos.Booking;

import java.util.List;

	@Service
	public class BookingService implements IBookingService {
		@Autowired
	    private final IBooking bookingDAO;

	    
	    public BookingService(IBooking bookingDAO) {
	        this.bookingDAO = bookingDAO;
	    }

	    @Override
	    public Booking getBookingById(Long bookingId) {
	        return bookingDAO.findById(bookingId).orElse(null);
	    }

	    @Override
	    public List<Booking> getAllBookings() {
	        return bookingDAO.findAll();
	    }

	    @Override
	    public Booking saveBooking(Booking booking) {
	        return bookingDAO.save(booking);
	    }

	    @Override
	    public void deleteBooking(Long bookingId) {
	        bookingDAO.deleteById(bookingId);
	    }
	}


