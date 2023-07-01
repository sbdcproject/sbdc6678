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

    @GetMapping("/mainboard2")
    public String mainboard2(){

        return "MainBoard2";
    }

    @GetMapping("/mainboard3")
    public String mainboard3(){

        return "MainBoard3";
    }

    @GetMapping("/subframe3")
    public String subframe3(){

        return "SubFrame3";
    }

    @GetMapping("/mainboard4")
    public String mainboard4(){

        return "MainBoard4";
    }

}
