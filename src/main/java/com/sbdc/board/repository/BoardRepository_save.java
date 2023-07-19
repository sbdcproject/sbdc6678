package com.sbdc.board.repository;

import com.sbdc.board.entity.TB_BOARD_SAVE;
import org.hibernate.mapping.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository_save extends JpaRepository<TB_BOARD_SAVE, Long> {

}