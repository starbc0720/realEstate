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

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false)
    private String loc;

    private Float area;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BuildType type;

    private Integer constructionYear;

    @Column(columnDefinition = "TEXT")
    private String summary;

    @Column(columnDefinition = "TEXT")
    private String embedding;

    @Column(updatable = false, nullable = false)
    private String createdBy;

    @Column
    private String updatedBy;
}
