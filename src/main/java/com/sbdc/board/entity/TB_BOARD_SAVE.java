package com.sbdc.board.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TB_BOARD_SAVE")
@Getter
@Setter
@Data
public class TB_BOARD_SAVE {

    @Column(nullable = true)
    private Integer COLUMN1_SAVE;

    @Column(nullable = true)
    private String COMPANYNAME_SAVE;

    @Column(nullable = true)
    private String SERVICECODE_SAVE;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(nullable = true)
    private Long COMPANYNUM_SAVE;

    @Column(nullable = true)
    private String CERTIFICATION_SAVE;

}