package com.rv.bike.controllers;

import com.rv.bike.models.Bike;
import com.rv.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Bike> list(){
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Bike get(@PathVariable("id") long id){
        return bikeRepository.getOne(id);
    }
}
