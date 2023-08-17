package com.sbdc.board.repository;

import com.sbdc.board.entity.TB_BOARD_SAVE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository_save extends JpaRepository<TB_BOARD_SAVE, String> {

}