package com.realEstate.conditionAlert;

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
public class conditionAlert {

    private String userId;

    private String loc;

    private Long priceMax;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private String type;

    private Float areaMin;

    @Builder.Default
    @Column(nullable = false)
    private Boolean enabled = false;
}
