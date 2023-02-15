package com.jj2ez.boardpjt.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

  private Long bno;
  private String title;
  private String content;
  private String boardId;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
