package com.bk.FamilyBudjetPlan;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.desktop.SystemSleepEvent;
import java.rmi.ServerException;

@RestController

public class FamBpController {
    @RequestMapping("/FBP")
    public String Fambp()
    {
        return "Family budjet begins here us123 ";
    }

    @PostMapping(path = "/Groc",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Groc> create(@RequestBody Groc newGroc) {
        Groc grc = grocService.save(newGroc);
        if (grc == null) {
            throw new ServerException();
        } else {
            return new ResponseEntity<>(grc, HttpStatus.CREATED);
        }

}
