package com.link.namjin.board.mapper;

import com.link.namjin.board.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardVO> getBoardList()throws Exception;

    int insertContent(BoardVO boardVO)throws Exception;
}
