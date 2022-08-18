package com.aia.innovationCity.serviceImpl;

import com.aia.innovationCity.entity.Sector;
import com.aia.innovationCity.entityDTO.SectorDTO;
import com.aia.innovationCity.repository.SectorRepository;
import com.aia.innovationCity.service.CityService;
import com.aia.innovationCity.service.ColorService;
import com.aia.innovationCity.service.SectorService;
import com.aia.innovationCity.service.ThemeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SectorServiceImpl implements SectorService {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CityService cityService;

    @Autowired
    private ThemeService themeService;

    @Autowired
    private ColorService colorService;

    @Autowired
    private SectorRepository sectorRepository;

    @Override
    public Sector saveSector(SectorDTO sectorDTO) {
        Sector sector = new Sector();
        try {
            sector = objectMapper.readValue(objectMapper.writeValueAsBytes(sectorDTO), Sector.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sector.setOrderNumber(1);
        sector.setCityId(cityService.findByIsDefault(1));
        sector.setThemeId(themeService.findByIsDefault(1));
        sector.setColorId(colorService.findByIsDefault(1));

        return sectorRepository.save(sector);
    }
}
