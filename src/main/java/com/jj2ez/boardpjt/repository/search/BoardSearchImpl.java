package com.jj2ez.boardpjt.repository.search;

import com.jj2ez.boardpjt.domain.Board;
import com.jj2ez.boardpjt.domain.QBoard;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.JPQLQuery;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class BoardSearchImpl extends QuerydslRepositorySupport implements BoardSearch {

  public BoardSearchImpl() {
    super(Board.class);
  }

  @Override
  public Page<Board> search1(Pageable pageable) {

    QBoard board = QBoard.board; // Q도메인 객체

    JPQLQuery<Board> query = from(board); // select ~ from board

    query.where(board.title.contains("1")); // where title like
    //Paging 추가
    this.getQuerydsl().applyPagination(pageable, query);

    List<Board> list = query.fetch();

    long count = query.fetchCount();

    return null;
  }

  @Override
  public Page<Board> searchAll(String[] types, String keyword, Pageable pageable) {

    QBoard board = QBoard.board; // Q 도메인 객체

    JPQLQuery<Board> query = from(board); // select ~ from board

    if ((types != null && types.length > 0) && keyword != null) { // 검색 조건과 키워드가 있다면

      BooleanBuilder booleanBuilder = new BooleanBuilder();

      for (String type : types) {

        switch (type) {
          case "t":
            booleanBuilder.or(board.title.contains(keyword));
            break;
          case "c":
            booleanBuilder.or(board.content.contains(keyword));
            break;
          case "b":
            booleanBuilder.or(board.boardId.contains(keyword));
            break;
        }
      } // end for
      query.where(booleanBuilder);
    } // end if
    query.where(board.bno.gt(0L));

    //Paging 추가
    this.getQuerydsl().applyPagination(pageable, query);

    List<Board> list = query.fetch();

    long count = query.fetchCount();

    return new PageImpl<>(list, pageable, count);
  }
}
