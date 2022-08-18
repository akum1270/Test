package com.aia.innovationCity.serviceImpl;

import com.aia.innovationCity.entity.UserData;
import com.aia.innovationCity.entityDTO.UserDataDTO;
import com.aia.innovationCity.model.LoginDetails;
import com.aia.innovationCity.repository.UserRepository;
import com.aia.innovationCity.service.CityService;
import com.aia.innovationCity.service.LoginService;
import com.aia.innovationCity.service.RoleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CityService cityService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserData validateCredential(String userName, String password) {

        return userRepository.findByUserNameAndPassword(userName,password);

    }

    @Override
    public String saveLoginDetails(List<UserDataDTO> userDataDTO) {
        List<UserData> userDataList = new ArrayList<>();
        userDataDTO.stream().forEach(x-> {
            UserData userData = null;
            try {
                userData = objectMapper.readValue(objectMapper.writeValueAsBytes(x), UserData.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            userData.setCity(cityService.findByIsDefault(1));
            userData.setRole(roleService.findByIsDefault(1));
            userDataList.add(userData);
        });
        userRepository.saveAll(userDataList);
        return "Added successfully";
    }
}
