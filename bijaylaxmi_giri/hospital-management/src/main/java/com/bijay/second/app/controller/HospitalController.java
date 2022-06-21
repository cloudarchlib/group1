package com.bijay.second.app.controller;

import com.bijay.second.app.data.Hospital;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class HospitalController {

    @GetMapping("/get/hospital/details")
    public String getDetail() {
        String name = "SriRama";
        return name;
    }

    @PostMapping("/post/hospitalpatientdetails")
    Hospital postpatient(@RequestBody Hospital newpatient) {
        return newpatient;
    }

    @PutMapping("/put/{name}")
    String putpatient(@RequestBody Hospital newpatient, @PathVariable String name) {
        return newpatient.toString() + ":Updated with name:" + name;
    }

    @DeleteMapping("/get/{name}")
    String deletepatient(@PathVariable String name) {
        return name;
    }

    @GetMapping("/path/{name}")
    public String getPathVar(@PathVariable("name") String name) {
        return "Path Variable:" + name;
    }

    }

