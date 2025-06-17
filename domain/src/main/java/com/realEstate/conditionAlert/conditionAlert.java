package com.realEstate.conditionAlert;

import com.realEstate.BaseEntity;
import com.realEstate.enums.BuildType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class conditionAlert extends BaseEntity {

    private String userId;

    private String loc;

    private Long priceMax;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BuildType type;

    private Float areaMin;

    @Builder.Default
    @Column(columnDefinition = "TINYINT(1) DEFAULT 0", nullable = false)
    private Boolean enabled = false;
}
