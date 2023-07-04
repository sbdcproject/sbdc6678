package com.sbdc.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity(name = "TB_BOARD")
@Getter
@Setter
public class TB_BOARD {

    @Column(nullable = false)
    private Integer COLUMN1;

    @Column(nullable = false)
    private String COMPANYNAME;

    @Column(nullable = false)
    private String SERVICECODE;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String COMPANYNUM;

    @Column(nullable = false)
    private String CERTIFICATIOM;
}