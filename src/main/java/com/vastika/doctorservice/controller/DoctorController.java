package com.vastika.doctorservice.controller;

import com.vastika.doctorservice.model.Doctor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(value = "/doctor-service/api/v1")
public class DoctorController {

    /*
        HTTP METHOD
        1. GET
        2. POST
        3. PUT
        4. PATCH
        5. DELETE
     */

    public DoctorController() {
        log.info("Doctor controller object is created");
    }

    @GetMapping
    public String index() {
        return "Doctor index";
    }

    @GetMapping(value = "/ping")
    public String ping() {
        return "Doctor Service is UP";
    }

    @PostMapping(value = "/doctor")
    public String createDoctor(Doctor doctor) {
        return "Doctor created successfully";
    }

    @PutMapping(value = "/doctor")
    public String update() {
        return "Doctor updated successfully";
    }

    @DeleteMapping(value = "/doctor")
    public String delete() {
        return "Doctor deleted successfully";
    }

    @GetMapping(value = "/doctor")
    public String getDoctors() {
        return "Doctor List";
    }

}
