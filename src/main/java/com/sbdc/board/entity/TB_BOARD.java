package com.sbdc.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TB_BOARD")
@Getter
@Setter
public class TB_BOARD {

    @Column(nullable = true)
    private Integer COLUMN1;

    @Column(nullable = true)
    private String COMPANYNAME;

    @Column(nullable = true)
    private String SERVICECODE;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String COMPANYNUM;

    @Column(nullable = true)
    private String CERTIFICATION;

}