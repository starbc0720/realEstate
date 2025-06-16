package com.realEstate.listing;

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
public class Listing extends BaseEntity {

    private String title;

    @Column(columnDefinition = "TEXT")
    private String desc;

    private Long price;

    private String loc;

    private Float area;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BuildType type;

    private Integer floor;

    @Column(columnDefinition = "TEXT")
    private String summary;

    @Column(columnDefinition = "TEXT")
    private String embedding;

    @Column(updatable = false)
    private String createdBy;

    @Column
    private String updatedBy;
}
