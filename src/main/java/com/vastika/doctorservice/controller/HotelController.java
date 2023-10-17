package com.vastika.doctorservice.controller;

import com.vastika.doctorservice.model.Address;
import com.vastika.doctorservice.model.Guest;
import com.vastika.doctorservice.model.Hotel;
import com.vastika.doctorservice.model.Hours;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Slf4j
@RequestMapping(value = "/doctor-service/api/v1")
public class HotelController {

    @GetMapping(value = "/hotel")
    public Hotel getHotel() {

        Address address = new Address("Nepal", "Bagmati", "Kathmandu");

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(new Guest("John", "Doe"));
        guests.add(new Guest("Maria", "Garcia"));
        guests.add(new Guest("Nikki", "Wolf"));

        Hours openHours = new Hours();
        String tempHour = "09:00AM - 07:00PM";
        openHours.setSunday(tempHour);
        openHours.setMonday(tempHour);
        openHours.setTuesday(tempHour);
        openHours.setWednesday(tempHour);
        openHours.setThursday(tempHour);
        openHours.setFriday(tempHour);
        openHours.setSaturday(tempHour);


        Hotel hotel = new Hotel();
        hotel.setName("ABC Hotel");
        hotel.setNumberOfGuests(guests.size());
        hotel.setAddress(address);
        hotel.setGuests(guests);
        hotel.set_open(true);
        hotel.setOpenHour(openHours);
        return hotel;

    }

}
