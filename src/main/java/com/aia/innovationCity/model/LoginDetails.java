package com.aia.innovationCity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginDetails {
    private String name;
    private int cityId;
    private String cityName;
    private String userType;

}
