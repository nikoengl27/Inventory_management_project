package com.example.InventoryManagement.controllers;

import com.example.InventoryManagement.models.MobilePhone;
import com.example.InventoryManagement.models.TV;
import com.example.InventoryManagement.repositories.TvRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TvController {

    TvRepository tvRepository;

    @GetMapping(value = "/tvs")
    public ResponseEntity<List<TV>> getAllTvs(){
        return new ResponseEntity<>(tvRepository.findAll(), HttpStatus.OK);
    }
}
