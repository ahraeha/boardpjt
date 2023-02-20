package com.jj2ez.boardpjt.repository;

import com.jj2ez.boardpjt.domain.Board;
import com.jj2ez.boardpjt.repository.search.BoardSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {


}
