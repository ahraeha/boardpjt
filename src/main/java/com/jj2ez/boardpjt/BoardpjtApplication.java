package com.jj2ez.boardpjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BoardpjtApplication {

  public static void main(String[] args) {
    SpringApplication.run(BoardpjtApplication.class, args);
  }

}
