package com.LottoWeb.LuckyLotto.Controller;

import com.LottoWeb.LuckyLotto.Service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board")
    public String boardPage(Model model) {
        model.addAttribute("comments", boardService.get5Comments());
        return "board";
    }

   @GetMapping("/save")
    public String saveComment( @RequestParam("content") String content) {
        boardService.saveComment(content);
        return "redirect:/board";
    }

    @GetMapping("/button")
    public String returnButton() {
        return "button";
    }

}