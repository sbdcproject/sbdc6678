package com.sbdc.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TB_BOARD_NUM")
@Getter
@Setter
public class TB_BOARD_NUM {

    @Column(nullable = true)
    private Integer COLUMN1NUM;

    @Column(nullable = true)
    private String COMPANYNAMENUM;

    @Column(nullable = true)
    private String SERVICECODENUM;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String COMPANYNUMNUM;

    @Column(nullable = true)
    private String CERTIFICATIONNUM;

}

