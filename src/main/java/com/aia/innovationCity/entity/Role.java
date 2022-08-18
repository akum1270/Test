package com.aia.innovationCity.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "role")
//public class Role extends BaseEntity<String> implements GrantedAuthority {
public class Role extends CommonFields implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "roleId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;
	private String roleName;
	@Column(columnDefinition="integer default 0")
	private Integer isDefault;

}