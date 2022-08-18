package com.aia.innovationCity.controller;

import com.aia.innovationCity.entityDTO.UserDataDTO;
import com.aia.innovationCity.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/validateCredentials")
    public ResponseEntity login(@RequestHeader("userName") String userName,
                                @RequestHeader("password") String password){
        return new ResponseEntity(loginService.validateCredential(userName,password), HttpStatus.OK);
    }

    @PostMapping("/saveLoginDetails")
    public ResponseEntity saveLoginDetails(@RequestBody List<UserDataDTO> userDataDTO){
        return new ResponseEntity(loginService.saveLoginDetails(userDataDTO), HttpStatus.OK);
    }
}
