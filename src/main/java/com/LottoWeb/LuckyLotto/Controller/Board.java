package com.LottoWeb.LuckyLotto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Board {

    @GetMapping("/board")
    public String boardPage() {
        return "board";
    }

   @GetMapping("/save")
    public String saveComment() {

    }

}
