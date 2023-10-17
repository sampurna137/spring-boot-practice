package com.vastika.doctorservice.model;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Getter
@Component
@Slf4j
public class Doctor {

    public Doctor() {
        log.info("Doctor object created");
    }

    private long id;
    private long nmcNumber;
    private String name;
    private String phoneNumber;
    private String email;
    private String specialty;
    private double fee;
}
