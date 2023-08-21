package com.sbdc.board.repository;

import com.sbdc.board.entity.TB_BOARD_NUM;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository_num extends JpaRepository<TB_BOARD_NUM, Integer> {
    @Nullable
    Page<TB_BOARD_NUM> findAllByCOMPANYNAMENUMAndSERVICECODENUMContainingAndCOMPANYNUMNUMContaining(String searchKeyword3, String searchKeyword1, String searchKeyword2, Pageable pageable);

}