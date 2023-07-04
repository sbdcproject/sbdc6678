package com.sbdc.board.repository;

import com.sbdc.board.entity.TB_BOARD;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository2 extends JpaRepository<TB_BOARD, Integer> {
    Page<TB_BOARD> findBySERVICECODEContaining(String searchKeyword2, Pageable pageable);
}
