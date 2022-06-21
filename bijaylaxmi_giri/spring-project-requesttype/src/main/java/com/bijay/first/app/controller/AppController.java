package com.bijay.first.app.controller;

import com.bijay.first.app.data.patient;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @GetMapping("/get/patient/name")
    public String getDetail() {
        String name = "Rama";
        return name;
    }

    @PostMapping("/post/patientdetails")
    patient postpatient(@RequestBody patient newpatient) {
        return newpatient;
    }

    @PutMapping("/put/{name}")
    String putpatient(@RequestBody patient newpatient, @PathVariable String name) {
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
