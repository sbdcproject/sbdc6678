package com.sbdc.board.repository;

import com.sbdc.board.entity.TB_BOARD;
import com.sbdc.board.entity.TB_BOARD_SAVE;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<TB_BOARD, String> {
    @Nullable
    Page<TB_BOARD> findByCERTIFICATIONContainingAndSERVICECODEContainingAndCOMPANYNUMContaining(String searchKeyword, String searchKeyword1, String searchKeyword2, Pageable pageable);


}