package com.sbdc.board.service;

import com.sbdc.board.entity.TB_BOARD;
import com.sbdc.board.entity.TB_BOARD_SAVE;
import com.sbdc.board.repository.BoardRepository;
import com.sbdc.board.repository.BoardRepository_save;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private BoardRepository_save boardRepository_save;
    @Nullable
    public Page<TB_BOARD> boardList(Pageable pageable){

        return boardRepository.findAll(pageable);
    }

    @Nullable
    public Page<TB_BOARD_SAVE> boardsaveList(Pageable pageable){

        return boardRepository_save.findAll(pageable);
    }

    @Nullable
    public Page<TB_BOARD> boardSearchList(String searchKeyword, String searchKeyword1, String searchKeyword2, Pageable pageable){
        return boardRepository.findByCERTIFICATIONContainingAndSERVICECODEContainingAndCOMPANYNUMContaining(searchKeyword, searchKeyword1, searchKeyword2, pageable);
    }


    @Nullable
    public void boardsave(TB_BOARD_SAVE boardsave) {
        System.out.println(boardsave);
        boardRepository_save.save(boardsave);
    }

    public void boardDelete(String COMPANYNUM_SAVE) {
        boardRepository_save.deleteById(COMPANYNUM_SAVE);
        System.out.println(COMPANYNUM_SAVE);
    }

}