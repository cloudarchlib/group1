package com.mahesh.app.controller;

import com.mahesh.app.data.Hospital;
import org.springframework.web.bind.annotation.*;

@RestController
public class HospitalController {

    @GetMapping("/getHospital")
    public String getDetails(){
        return "hospitaldetails";
    }
    @PostMapping("/postHospital/{name}")
    Hospital postHospital (@RequestBody Hospital newHospital){
        return newHospital;
    }
    @PutMapping("/putHospital/{name}")
    public String putHospital(@RequestBody Hospital newHospital, @PathVariable String name){
        return newHospital.toString() + "updated with name" +name;
    }
    @DeleteMapping("/deleteHospital/{name}")
    public String deleteHospital(@PathVariable String name){
        return "deleted" +name;
    }
    @GetMapping("/getHospital/{name}")
    public String getVar (@PathVariable String name){
        return name ;
    }

}
