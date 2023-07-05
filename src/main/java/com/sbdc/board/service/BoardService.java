package com.sbdc.board.service;

import com.sbdc.board.entity.TB_BOARD;
import com.sbdc.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardService {




    public void write(TB_BOARD board){

        boardRepository.save(board);
    }

    public Page<TB_BOARD> boardList(Pageable pageable){

        return boardRepository.findAll(pageable);
    }

    @Autowired
    private BoardRepository boardRepository;

    public Page<TB_BOARD> boardSearchList(String searchKeyword, String searchKeyword1, Pageable pageable){
        return boardRepository.findByCERTIFICATIOMContainingAndSERVICECODEContaining(searchKeyword, searchKeyword1, pageable);
    }



    public TB_BOARD boardView(Integer id){
        return boardRepository.findById(id).get();
    }
}

