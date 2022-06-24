package com.bijay.second.app.controller;

import com.bijay.second.app.data.Hospital;
import org.springframework.web.bind.annotation.*;

@RestController
public class hospitalcontroller {

    @GetMapping("/get/hospital/details")
    public String getDetail() {
        String name = "SriRama";
        return name;
    }

    @PostMapping("/post/hospitalpatientdetails")
    Hospital postpatient(@RequestBody Hospital newpatient) {
        return newpatient;
    }

    @PutMapping("/put/hospital/{name}")
    String putpatient(@RequestBody Hospital newpatient, @PathVariable String name) {
        return newpatient.toString() + ":Updated with name:" + name;
    }

    @DeleteMapping("/get/hospital/{name}")
    String deletepatient(@PathVariable String name) {
        return name;
    }

    @GetMapping("/path/hospital/{name}")
    public String getPathVar(@PathVariable("name") String name) {
        return "Path Variable:" + name;
    }

    }

