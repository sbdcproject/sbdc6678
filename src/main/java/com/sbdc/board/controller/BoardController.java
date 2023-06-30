package com.sbdc.board.controller;

import com.sbdc.board.entity.TB_BOARD;
import com.sbdc.board.service.BoardService;
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
    public String boardList(Model model){

        model.addAttribute("list", boardService.boardList());

        return "MainBoard";
    }

}
