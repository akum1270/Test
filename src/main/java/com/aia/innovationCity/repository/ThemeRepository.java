package com.aia.innovationCity.repository;

import com.aia.innovationCity.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Integer> {
    Theme findByIsDefault(int value);
}
