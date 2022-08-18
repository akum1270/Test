package com.aia.innovationCity.entityDTO;

import com.aia.innovationCity.entity.City;
import com.aia.innovationCity.entity.Role;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
public class UserDataDTO {

    private String userName;

    private String email;

    private String password;

}
