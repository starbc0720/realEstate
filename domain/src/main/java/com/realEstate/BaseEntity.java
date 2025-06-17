package com.realEstate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;

@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
@Getter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(generator = "ulid")
    @GenericGenerator(name="ulid", strategy = "com.realEstate.generator.UlidGenerator")
    @Column(length=26)
    private String idx;

    @CreatedDate
    @Column(updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    private Timestamp modifiedAt;
}
