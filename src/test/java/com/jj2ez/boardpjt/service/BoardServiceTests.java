package com.jj2ez.boardpjt.service;

import com.jj2ez.boardpjt.dto.BoardDTO;
import com.jj2ez.boardpjt.dto.PageRequestDTO;
import com.jj2ez.boardpjt.dto.PageResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class BoardServiceTests {

  @Autowired
  private BoardService boardService;

  @Test
  public void testRegister() {

    log.info(boardService.getClass().getName());

    BoardDTO boardDTO = BoardDTO.builder()
        .title("Sample Title...")
        .content("Sample Content...")
        .boardId("user00")
        .build();

    Long bno = boardService.register(boardDTO);

    log.info("bno: " + bno);
  }

  @Test
  public void testModify() {
    BoardDTO boardDTO = BoardDTO.builder()
        .bno(101L)
        .title("Updated.....101")
        .content("Updated content 101...")
        .build();

    boardService.modify(boardDTO);
  }

  @Test
  public void testList() {

    PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
        .type("tcb")
        .keyword("1")
        .page(1)
        .size(10)
        .build();

    PageResponseDTO<BoardDTO> responseDTO = boardService.list(pageRequestDTO);

    log.info(responseDTO);
  }
}
