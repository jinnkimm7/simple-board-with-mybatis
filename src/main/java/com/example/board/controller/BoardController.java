package com.example.board.controller;

import com.example.board.dto.BoardDto;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String save(BoardDto boardDto) {
        System.out.println("BoardController.save");
        System.out.println("boardDto = " + boardDto);
        return "index";
    }
}
