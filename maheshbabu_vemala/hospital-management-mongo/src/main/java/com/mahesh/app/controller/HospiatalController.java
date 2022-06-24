package com.mahesh.app.controller;

import com.mahesh.app.data.Hospital;
import com.mahesh.app.data.Patient;
import com.mahesh.app.repo.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HospiatalController {
    @Autowired
    HospitalRepository hospitalRepository;

    @RequestMapping(value = "/createhosp", method = RequestMethod.POST)
    public Hospital createh(@RequestBody Hospital hosp) {
        hosp = hospitalRepository.save(hosp);
        return hosp;
    }

    @GetMapping("/gethosp")
    public List<Hospital> getDetails (){
        return hospitalRepository.findAll();
    }
}
