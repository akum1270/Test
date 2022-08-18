package com.aia.innovationCity.repository;

import com.aia.innovationCity.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {
    Color findByIsDefault(int value);
}
