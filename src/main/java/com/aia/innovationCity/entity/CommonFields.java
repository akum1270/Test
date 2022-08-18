package com.aia.innovationCity.entity;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class CommonFields {

    @Column(name = "createdOn", updatable = false)
    @DateTimeFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    @CreationTimestamp
    private Date createdOn;

    @Column(name = "updatedOn")
    @DateTimeFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    @UpdateTimestamp
    private Date updatedOn;

    @Value("${some.key:A}")
    private String status;

}
