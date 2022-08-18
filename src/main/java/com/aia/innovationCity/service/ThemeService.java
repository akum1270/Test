package com.aia.innovationCity.service;

import com.aia.innovationCity.entity.City;
import com.aia.innovationCity.entity.Theme;

public interface ThemeService {

    public Theme findByIsDefault(int value);
}
