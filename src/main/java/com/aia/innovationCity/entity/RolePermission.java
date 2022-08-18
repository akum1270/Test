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

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class RolePermission extends CommonFields implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "roleId")
	private Role roleId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "permissionId")
	private Permission permissionID;
}
