package com.sbdc.board.controller;

import com.sbdc.board.entity.TB_BOARD;
import com.sbdc.board.service.BoardService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;
    @GetMapping("/mainframe")
    public String mainframeportal(){

        return "MainFrame";
    }

    @GetMapping("/subframe1")
    public String subframeportal1(){

        return "SubFrame1";
    }

    @GetMapping("/subframe2")
    public String subframeportal2(){

        return "SubFrame2";
    }

    @GetMapping("/mainboard")
    public String boardList(Model model,
                            @PageableDefault(page = 0, size = 10) Pageable pageable,
                            String searchKeyword){

        Page<TB_BOARD> list = null;

        if(searchKeyword == null) {
            list = boardService.boardList(pageable);
        }else {
            list = boardService.boardSearchList(searchKeyword, pageable);
        }


        int nowPage = list.getPageable().getPageNumber() + 1;
        int startPage = Math.max(nowPage - 4, 1);
        int endPage = Math.min(nowPage + 5, list.getTotalPages());

        model.addAttribute("list", list);
        model.addAttribute("nowPage", nowPage);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);

        return "MainBoard";
    }

    @GetMapping("/mainboard2")
    public String mainboard2(){

        return "MainBoard2";
    }

    @GetMapping("/subframe3")
    public String subframe3(){

        return "SubFrame3";
    }

}
