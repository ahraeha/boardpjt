package com.jj2ez.boardpjt.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
@Getter
abstract class BaseEntity {

  @CreatedDate
  @Column(name = "createdAt", updatable = false) // 생성일 created_at
  private LocalDateTime createdAt;

  @LastModifiedDate
  @Column(name = "updatedAt") // 수정일 updated_at
  private LocalDateTime updatedAt;
}
