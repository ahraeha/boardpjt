package com.jj2ez.boardpjt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //데이터 베이스에 위임
  private Long bno;

  @Column(length = 500, nullable = false)
  private String title; //제목

  @Column(length = 2000, nullable = false)
  private String content; //내용

  @Column(length = 50, nullable = false)
  private String boardId;

  public void change(String title, String content) {
    this.title = title;
    this.content = content;
  }
}
