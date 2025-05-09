package com.link.namjin.board.service.impl;

import com.link.namjin.board.mapper.BoardMapper;
import com.link.namjin.board.service.BoardService;
import com.link.namjin.board.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardMapper boardMapper;

    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    @Override
    public List<BoardVO> getBoardList() throws Exception {
        return boardMapper.getBoardList();
    }

    @Override
    public int insertContent(BoardVO boardVO) throws Exception {
        return boardMapper.insertContent(boardVO);
    }
}
