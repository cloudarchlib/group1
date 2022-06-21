package com.rama.app.controller;

import com.rama.app.data.Employee;
import com.rama.app.data.patient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;


@RestController
public class AppController {
    @GetMapping("/get/patient/name")
    public String getDetail() {
        return "Rama";
    }

    @PostMapping("/post/patientdetail")
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

    @GetMapping("/request")
    public String getRequestparam(@RequestParam(name = "name", required = true, defaultValue = "rama") String name,
                                  @RequestParam(name = "ID", required = true, defaultValue = "emergency") String role) {
        return "Request Param:" + name+":"+ID;
    }

    @GetMapping("/request/params")
    public String getRequestparams(@RequestParam List<String> id) {
        return "Request Param:" + id;
    }


    @GetMapping("/header")
    public ResponseEntity<String> getRequestparam(@RequestHeader HttpHeaders header) {

        if (isHeaderMissing(header, "name")) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.setExpires(ZonedDateTime.now()
                .plusDays(1));
        String response = "Valid Header";
        return ResponseEntity.ok()
                .headers(responseHeader)
                .body(response);
    }

    private boolean isHeaderMissing(final HttpHeaders header, final String headerKey) {

        if (!header.containsKey(headerKey)) {
            return true;
        }
        return false;
    }

}
