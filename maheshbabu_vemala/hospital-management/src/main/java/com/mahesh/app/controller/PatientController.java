package com.mahesh.app.controller;

import com.mahesh.app.data.Patient;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @GetMapping("/get")
    public String getDetails() {
        return "get patient";
    }
    @PostMapping("/post")
    Patient postPatient (@RequestBody Patient newPatient) {
        return newPatient;
    }
    @PutMapping("/put/{patient}")
    public String putPatient(@RequestBody Patient newPatient, @PathVariable String patient) {
        return newPatient.toString() + ":updated with patient name:" +patient;
    }
    @DeleteMapping("/delete/{patient}")
    public String deletePatient(@PathVariable String patient){
        return patient;
    }

}
