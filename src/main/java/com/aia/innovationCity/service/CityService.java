package com.aia.innovationCity.service;

import com.aia.innovationCity.entity.City;

public interface CityService {

    public City findByCityId(int cityId);

    public City findByIsDefault(int value);
}
