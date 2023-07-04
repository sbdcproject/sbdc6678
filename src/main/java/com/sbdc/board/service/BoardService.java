package com.sbdc.board.service;

import com.sbdc.board.entity.TB_BOARD;
import com.sbdc.board.repository.BoardRepository;
import com.sbdc.board.repository.BoardRepository1;
import com.sbdc.board.repository.BoardRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;


    public void write(TB_BOARD board){

        boardRepository.save(board);
    }

    public Page<TB_BOARD> boardList(Pageable pageable){

        return boardRepository.findAll(pageable);
    }
    public Page<TB_BOARD> boardList1(Pageable pageable){

        return boardRepository1.findAll(pageable);
    }

    public Page<TB_BOARD> boardList2(Pageable pageable){

        return boardRepository2.findAll(pageable);
    }

    public Page<TB_BOARD> boardSearchList(String searchKeyword, Pageable pageable){
        return boardRepository.findByCERTIFICATIOMContaining(searchKeyword, pageable);
    }

    @Autowired
    private BoardRepository1 boardRepository1;
    public Page<TB_BOARD> boardSearchList1(String searchKeyword1, Pageable pageable){
        return boardRepository1.findByCOMPANYNUMContaining(searchKeyword1, pageable);
    }

    @Autowired
    private BoardRepository2 boardRepository2;
    public Page<TB_BOARD> boardSearchList2(String searchKeyword2, Pageable pageable){
        return boardRepository2.findBySERVICECODEContaining(searchKeyword2, pageable);
    }


    public TB_BOARD boardView(Integer id){
        return boardRepository.findById(id).get();
    }
}
