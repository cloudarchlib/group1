package com.bijay.second.app.controller;

import com.bijay.second.app.data.Patient;
import org.springframework.web.bind.annotation.*;

@RestController
public class patientcontroller {

    @GetMapping("/get/patient/name")
    public String getDetail() {
        String name = "Rama";
        return name;
    }

    @PostMapping("/post/patientdetails")
    Patient postpatient(@RequestBody Patient newpatient) {
        return newpatient;
    }

    @PutMapping("/put/{name}")
    String putpatient(@RequestBody Patient newpatient, @PathVariable String name) {
        return newpatient.toString() + ":Updated with name:" + name;
    }

    @DeleteMapping("/delete/{name}")
    String deletepatient(@PathVariable String name) {
        return name;
    }

    @GetMapping("/path/{name}")
    public String getPathVar(@PathVariable("name") String name) {
        return "Path Variable:" + name;
    }



}
