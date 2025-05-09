package com.link.namjin.board.service;

import com.link.namjin.board.vo.BoardVO;

import java.util.List;

public interface BoardService {
        List<BoardVO> getBoardList()throws Exception;

        int insertContent(BoardVO boardVO)throws Exception;
}
