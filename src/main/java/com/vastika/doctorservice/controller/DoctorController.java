package com.vastika.doctorservice.controller;

import com.vastika.doctorservice.model.Doctor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(value = "/api/v1")
@Tag(name = "Doctor API V1", description = "This is V1 API")
public class DoctorController {

    /*
        HTTP METHOD
        1. GET
        2. POST
        3. PUT
        4. PATCH
        5. DELETE
     */

    /*
        HTTP CODE
        2xx
            200 - Success or OK

        3xx

        4xx
            400 - Bad Request
            404 - NOT FOUND
            405 - Method not allowed

        5xx

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

    @Operation(
            summary = "Create Doctor",
            description = "This is used to create a doctor")
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

    @GetMapping(value = "/doctor/{doctorId}")
    public String getDoctorDetail(@PathVariable(value = "doctorId") Long id) {
        log.info(String.valueOf(id));
        return "Doctor Detail";
    }

    @GetMapping(value = "/doctor/speciality")
    public String getDoctorWithSpecialities(@RequestParam(value = "special", required = false) String spe_var) {
        log.info(String.valueOf(spe_var));

        return "Doctor List of specific speciality";
    }

}
