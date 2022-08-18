package com.aia.innovationCity.service;

import com.aia.innovationCity.entity.UserData;
import com.aia.innovationCity.entityDTO.UserDataDTO;
import com.aia.innovationCity.model.LoginDetails;

import java.util.List;

public interface LoginService {

    public UserData validateCredential(String userName, String password);

    String saveLoginDetails(List<UserDataDTO> userDataDTO);
}
