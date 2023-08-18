package com.sbdc.board.entity;


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
    private String COMPANYNAME_SAVE;

    @Column(nullable = true)
    private String SERVICECODE_SAVE;

    @Id
    @Column
    private String COMPANYNUM_SAVE;

    @Column(nullable = true)
    private String CERTIFICATION_SAVE;

}