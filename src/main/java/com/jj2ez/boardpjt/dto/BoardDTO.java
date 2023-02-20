package com.jj2ez.boardpjt.dto;

import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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

  @NotEmpty
  @Size(min = 3, max = 100)
  private String title;

  @NotEmpty
  private String content;

  @NotEmpty
  private String boardId;
  //ToDo Error - Type miss Matched
//  private String numberOfRecruits;

//  @NotEmpty
//  private String region;

//  private LocalDateTime recruitmentClose;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;

}
