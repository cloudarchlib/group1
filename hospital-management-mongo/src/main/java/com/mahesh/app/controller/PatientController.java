package com.mahesh.app.controller;

import com.mahesh.app.data.Patient;
import com.mahesh.app.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientRepository patientRepo;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Patient create(@RequestBody Patient patien) {
        patien = patientRepo.save(patien);
        return patien;
    }
    @GetMapping("/patient")
    public List<Patient> getDetails(){
        return patientRepo.findAll();
    }

}
