package com.sbdc.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity(name = "MY_BOARD")
@Getter
@Setter
public class MY_BOARD {

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
    private String CERTIFICATION;
}
