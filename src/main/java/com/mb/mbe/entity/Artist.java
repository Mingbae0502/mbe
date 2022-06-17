package com.mb.mbe.entity;

import jp.sf.amateras.mirage.annotation.Column;
import jp.sf.amateras.mirage.annotation.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "ARTIST")
public class Artist {

//    @Id
//    @PrimaryKey(generationType = GenerationType.SEQUENCE, generator = "SEQ_ARTIST")
    @Column(name = "ARTIST_ID")
    private Long artistId;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "NICK_NAME")
    private String nickName;

    @Column(name = "STAGE_NAME")
    private String stageName;

    @Column(name = "SPECIALIZATION")
    private String specialization;
}
