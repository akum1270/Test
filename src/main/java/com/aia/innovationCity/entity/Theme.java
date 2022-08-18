package com.aia.innovationCity.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Theme extends CommonFields implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "themeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer themeId;
	
	private String themeName;
	
	private String themeType;
	
	private int rating;

	@Column(columnDefinition="integer default 0")
	private int isDefault;
}
