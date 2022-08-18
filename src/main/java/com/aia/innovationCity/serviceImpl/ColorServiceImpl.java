package com.aia.innovationCity.serviceImpl;

import com.aia.innovationCity.entity.Color;
import com.aia.innovationCity.repository.ColorRepository;
import com.aia.innovationCity.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Override
    public Color findByIsDefault(int value) {
        return colorRepository.findByIsDefault(value);
    }
}
