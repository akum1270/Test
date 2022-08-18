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
public class Permission extends CommonFields implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "permissionId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer permissionId;
	
	private String permissionName;
	
}
