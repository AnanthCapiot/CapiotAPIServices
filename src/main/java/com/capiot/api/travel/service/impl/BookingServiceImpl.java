package com.capiot.api.travel.service.impl;

import com.capiot.api.travel.model.AirOrder;
import com.capiot.api.travel.model.Booking;
import com.capiot.api.travel.model.FlightSegment;
import com.capiot.api.travel.service.BookingService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service( "BookingService" )
public class BookingServiceImpl implements BookingService {

    @Override
    public List<Booking> getAllBookings() throws Exception {
        ArrayList<Booking> allBookings = new ArrayList<>();
        Booking airBooking1 = new Booking();
        airBooking1.setBookingID( "CZG-123-456-7890");
        airBooking1.setBookingStatus( "Confirmed" );
        airBooking1.setCreatedDateTime( ZonedDateTime.now() );

        AirOrder delBomAirOrder = new AirOrder();
        delBomAirOrder.setAirlineCode( "GOW" );
        delBomAirOrder.setAirlineName( "GO Air" );
        delBomAirOrder.setCurrency( "INR" );
        delBomAirOrder.setOrderID( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ) );
        delBomAirOrder.setOrderRefNumber( UUID.randomUUID().toString().toUpperCase().substring( 0, 8 ) );
        delBomAirOrder.setSegmentsCount( 1 );
        delBomAirOrder.setTicketCost( new BigDecimal( 13000 ));
        delBomAirOrder.setSupplierID( "MK-MY-TRIP-DEL" );
        delBomAirOrder.setSupplierName( "Make My Trip" );
        delBomAirOrder.setTicketingPNR( "TCK-APYXIW");

        FlightSegment delBomSegment = new FlightSegment();
        delBomSegment.setAirlinePNR( "APYXIW" );
        delBomSegment.setDestinationCode( "BOM" );
        delBomSegment.setEndTime( ZonedDateTime.now() );
        delBomSegment.setDestinationName( "Mumbai" );
        delBomSegment.setOriginCode( "DEL" );
        delBomSegment.setOriginName( "Delhi" );
        delBomSegment.setSegmentID( "G8-640" );
        delBomSegment.setStartTime( ZonedDateTime.now() );
        delBomSegment.setStatus( "OK" );

        ArrayList<FlightSegment> airOrderFlightSegments = new ArrayList<>();
        airOrderFlightSegments.add( delBomSegment );
        delBomAirOrder.setOdoOptions( airOrderFlightSegments );

        ArrayList<AirOrder> airOrders = new ArrayList<>();
        airOrders.add( delBomAirOrder );

        airBooking1.setAirOrders( airOrders );
        allBookings.add( airBooking1 );
        return allBookings;
    }

    @Override
    public Booking getBooking(String bookingID) throws Exception {
        return null;
    }

    @Override
    public Booking createBooking(Booking newBooking) throws Exception {
        return null;
    }

    @Override
    public void updateBooking(Booking aBooking, String id) throws Exception {

    }
}
