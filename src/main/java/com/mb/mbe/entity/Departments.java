package com.mb.mbe.entity;

import jp.sf.amateras.mirage.annotation.Column;
import jp.sf.amateras.mirage.annotation.PrimaryKey;
import jp.sf.amateras.mirage.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@ToString
@Table(name = "DEPARTMENTS")
@AllArgsConstructor
@Setter
@Getter
public class Departments implements Serializable {

    @Id
    @PrimaryKey(generationType = PrimaryKey.GenerationType.APPLICATION)
    @Column(name = "DEPARTMENT_ID")
    private Long department_Id;
    @Column(name = "DEPARTMENT_NAME")
    private String department_Name;
    @Column(name = "MANAGER_ID")
    private Long manager_Id;
    @Column(name = "LOCATION_ID")
    private Long location_Id;
}
