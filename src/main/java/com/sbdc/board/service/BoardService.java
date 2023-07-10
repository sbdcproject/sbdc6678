package com.sbdc.board.service;

import com.sbdc.board.entity.TB_BOARD;
import com.sbdc.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public Page<TB_BOARD> boardList(Pageable pageable){

        return boardRepository.findAll(pageable);
    }

    public Page<TB_BOARD> boardSearchList(String searchKeyword, String searchKeyword1, String searchKeyword2, Pageable pageable){
        return boardRepository.findByCERTIFICATIOMContainingAndSERVICECODEContainingAndCOMPANYNUMContaining(searchKeyword, searchKeyword1, searchKeyword2, pageable);
    }

}

