package com.realEstate.listing.dto;

import com.realEstate.listing.Listing;

import java.sql.Timestamp;

public record ListSearchResponseTemp(
        String idx,

        String title,

        String description,

        Long price,

        String loc,

        Float area,

        String type,

        Integer constructionYear,

        String summary,

        String embedding,

        String createdBy,

        String updatedBy,

        Timestamp createdAt,

        Timestamp modifiedAt
) {
    public static ListSearchResponseTemp fromEntity(Listing entity) {
        return new ListSearchResponseTemp(
                entity.getIdx(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getLoc(),
                entity.getArea(),
                entity.getType() != null ? entity.getType().getLabel() : null,
                entity.getConstructionYear(),
                entity.getSummary(),
                entity.getEmbedding(),
                entity.getCreatedBy(),
                entity.getUpdatedBy(),
                entity.getCreatedAt(),
                entity.getModifiedAt()
        );
    }
}
