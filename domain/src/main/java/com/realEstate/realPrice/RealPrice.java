package com.realEstate.realPrice;

import com.realEstate.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RealPrice extends BaseEntity {

    private String aptNm;

    private String loc;

    private Date dealDt;

    private Long price;

    private Float floor;

    private String src;
}
