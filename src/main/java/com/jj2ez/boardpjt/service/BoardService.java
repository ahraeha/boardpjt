package com.jj2ez.boardpjt.service;

import com.jj2ez.boardpjt.dto.BoardDTO;
import com.jj2ez.boardpjt.dto.PageRequestDTO;
import com.jj2ez.boardpjt.dto.PageResponseDTO;

public interface BoardService {
  Long register(BoardDTO boardDTO);
  BoardDTO readOne(Long bno);
  void modify(BoardDTO boardDTO);
  void remove(Long bno);
  PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

}
