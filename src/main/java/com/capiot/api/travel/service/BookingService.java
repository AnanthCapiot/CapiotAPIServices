package com.capiot.api.travel.service;

import com.capiot.api.travel.model.Booking;
import java.util.List;

public interface BookingService {

    public List<Booking> getAllBookings() throws Exception;

    public Booking getBooking( String bookingID ) throws Exception;

    public Booking createBooking( Booking newBooking ) throws Exception;

    public void updateBooking(Booking aBooking, String id  ) throws Exception;
}
