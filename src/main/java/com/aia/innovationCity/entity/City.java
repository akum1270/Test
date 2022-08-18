package com.aia.innovationCity.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class City extends CommonFields implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cityId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cityId;
	
	private String cityName;
	
	private int citySize;

	@Column(columnDefinition="integer default 0")
	private Integer isDefault;

}
