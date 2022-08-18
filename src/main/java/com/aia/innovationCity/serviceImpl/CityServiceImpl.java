package com.aia.innovationCity.serviceImpl;

import com.aia.innovationCity.entity.City;
import com.aia.innovationCity.repository.CityRepository;
import com.aia.innovationCity.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository CityRepository;

    @Override
    public City findByCityId(int cityId) {
        return CityRepository.findByCityId(cityId);
    }

    @Override
    public City findByIsDefault(int value) {
        return CityRepository.findByIsDefault(value);
    }
}
