package com.example.azubidistiller.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.azubidistiller.dao.KundeRepo;
import com.example.azubidistiller.model.Kunde;

@RestController
@RequestMapping("/kunden")
@CrossOrigin(origins = "*")
public class KundeController {


    @Autowired
    KundeRepo repo;

    @PostMapping("")
    public void createKunde(@RequestBody(required = false) Kunde kunde){
        repo.save(kunde);
        
    }

    @GetMapping("/getAll")
    public Iterable<Kunde> getAll(){
        return repo.findAll();
    }


    
}
