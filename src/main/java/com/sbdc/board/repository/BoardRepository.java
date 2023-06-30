package com.sbdc.board.repository;

import com.sbdc.board.entity.TB_BOARD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<TB_BOARD, Integer> {
}
