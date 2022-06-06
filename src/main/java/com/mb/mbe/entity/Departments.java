package com.mb.mbe.entity;

import com.miragesql.miragesql.annotation.Table;
import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
//@Table(name = "DEPARTMENTS")

public class Departments {

//    @Id
//    @PrimaryKey(generationType= PrimaryKey.GenerationType.SEQUENCE,generator="SEQ_DEPARTMENTS")
    private Long department_id;
    private String department_name;
    private Long manager_id;
    private Long location_id;

}
