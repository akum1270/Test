package com.aia.innovationCity.entity;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Sector implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "sectorId", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sectorId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId")
    private City cityId;

    private String sectorName;

    private int sectorSize;

    @Column(name = "orderNumber")
    private Integer orderNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "themeId")
    private Theme themeId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "colorId")
    private Color colorId;


}
