package com.link.namjin.board.controller;

import com.link.namjin.board.service.BoardService;
import com.link.namjin.board.vo.BoardVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/board/*")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("list")
    public List<BoardVO> getBoardList()throws Exception{
        return boardService.getBoardList();
    }

    @PostMapping("insert")
    public int insertContent(@RequestBody BoardVO boardVO)throws Exception{
        return boardService.insertContent(boardVO);
    }
}
