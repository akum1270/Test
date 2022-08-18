package com.aia.innovationCity.repository;

import com.aia.innovationCity.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    City findByCityId(int cityId);

    City findByIsDefault(int value);
}
