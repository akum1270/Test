package com.aia.innovationCity.serviceImpl;

import com.aia.innovationCity.entity.Theme;
import com.aia.innovationCity.repository.ThemeRepository;
import com.aia.innovationCity.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public Theme findByIsDefault(int value) {
        return themeRepository.findByIsDefault(value);
    }
}
