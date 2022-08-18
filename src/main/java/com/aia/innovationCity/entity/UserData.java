package com.aia.innovationCity.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "UserData")
public class UserData extends CommonFields implements Serializable {

	private static final long serialVersionUID = 3384556594865652578L;

	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String userName;

	private String email;

	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "roleId",nullable = true)
	private Role role;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cityId",nullable = true)
	private City city;
	
}