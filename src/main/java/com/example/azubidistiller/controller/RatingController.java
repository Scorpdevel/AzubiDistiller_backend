// package com.example.azubidistiller.controller;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.azubidistiller.dao.RatingRepo;
// import com.example.azubidistiller.model.Rating;

// @RestController
// @RequestMapping("/rating")
// @CrossOrigin(origins = "*")
// public class  RatingController {
    

//     @Autowired
//     RatingRepo repo;

//     @PostMapping("")
//     public void createKunde(@RequestBody(required = false) Rating rating){
//         repo.save(rating);
        
//     }

//     @GetMapping("/getAll")
//     public Iterable<Rating> getAll(){
//         return repo.findAll();
//     }
// }
