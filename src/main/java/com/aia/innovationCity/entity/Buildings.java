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
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "building")
public class Buildings extends CommonFields implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "buildingId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buildingId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sectorId", referencedColumnName = "sectorId")
    private Sector sectorId;

    private String buildingName;

    private int buildingSize;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ideaId")
    private Idea ideaId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "colorId")
    private Color colorId;


}
