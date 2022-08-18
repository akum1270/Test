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
public class Idea extends CommonFields implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ideaId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ideaId;
	
	private String ideaName;
	
	private String ideaSummary;
	
	private String ideaDetail;
	
	private String url; 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "createdBy")
	private UserData createdBy;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "updateBy")
	private UserData updateBy;
}
