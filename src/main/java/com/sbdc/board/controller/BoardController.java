package com.sbdc.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
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
    public String mainboard(){

        return "MainBoard";
    }

}
