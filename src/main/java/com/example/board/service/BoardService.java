package com.example.board.service;

import com.example.board.dto.BoardDto;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDto boardDto) {
        boardRepository.save(boardDto);
    }
}
