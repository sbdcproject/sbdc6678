package com.sbdc.board.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Board {
    private Integer COLUMN1;

    private String COMPANYNAME;

    private String SERVICECODE;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer COMPANYNUM;

    private Integer CERTIFICATIOM;

}
