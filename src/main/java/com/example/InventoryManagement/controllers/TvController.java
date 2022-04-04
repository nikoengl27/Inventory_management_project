package com.example.InventoryManagement.controllers;

import com.example.InventoryManagement.models.Laptop;
import com.example.InventoryManagement.models.TV;
import com.example.InventoryManagement.repositories.TvRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TvController {

    TvRepository tvRepository;

    @GetMapping(value = "/tvs")
    public ResponseEntity<List<TV>> getAllLaptops(){
        return new ResponseEntity<>(tvRepository.findAll(), HttpStatus.OK);
    }
}
