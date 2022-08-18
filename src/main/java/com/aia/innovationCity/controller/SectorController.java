package com.aia.innovationCity.controller;

import com.aia.innovationCity.entity.Sector;
import com.aia.innovationCity.entityDTO.SectorDTO;
import com.aia.innovationCity.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sector")
public class SectorController {

    @Autowired
    private SectorService sectorService;

    @PostMapping("/saveSector")
    public ResponseEntity saveSector(@RequestBody SectorDTO sectorDTO){
        return new ResponseEntity(sectorService.saveSector(sectorDTO), HttpStatus.OK);
    }
}
