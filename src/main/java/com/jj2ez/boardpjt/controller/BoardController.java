package com.jj2ez.boardpjt.controller;

import com.jj2ez.boardpjt.dto.BoardDTO;
import com.jj2ez.boardpjt.dto.PageRequestDTO;
import com.jj2ez.boardpjt.dto.PageResponseDTO;
import com.jj2ez.boardpjt.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@Log4j2
@RequiredArgsConstructor
public class BoardController {

  private final BoardService boardService;

  @GetMapping("/list")
  public void list(PageRequestDTO pageRequestDTO, Model model) {

    PageResponseDTO<BoardDTO> responseDTO = boardService.list(pageRequestDTO);

    log.info(responseDTO);

    model.addAttribute("responseDTO", responseDTO);

  }

}