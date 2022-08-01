package com.example.azubidistiller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;



@RequestMapping("/")
@CrossOrigin(origins = "*")
@RestController
public  class Welcome {  

    @GetMapping("/")
    public String wilkommen(){
        return "wilkommen";
    }
    
}
