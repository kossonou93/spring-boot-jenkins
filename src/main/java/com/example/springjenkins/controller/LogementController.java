package com.example.springjenkins.controller;

import com.example.springjenkins.entity.Logement;
import com.example.springjenkins.repository.LogementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LogementController {

    @Autowired
    private LogementRepository logementRepository;

    @GetMapping("/logements")
    public List<Logement> listeLogements(){
        return logementRepository.findAll();
    }

    @PostMapping("/logement")
    public Logement creerLogement(@RequestBody Logement logement){
        return logementRepository.save(logement);
    }
}
