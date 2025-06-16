package com.realEstate.listing.dto;

import com.realEstate.listing.Listing;

public record ListSearchResponse(
        String title,

        String desc,

        Long price,

        String loc,

        Float area,

        String type,

        Integer floor,

        String summary,

        String embedding
) {
    public static ListSearchResponse fromEntity(Listing entity) {
        return new ListSearchResponse(
                entity.getTitle(),
                entity.getDesc(),
                entity.getPrice(),
                entity.getLoc(),
                entity.getArea(),
                entity.getType() != null ? entity.getType().getLabel() : null,
                entity.getFloor(),
                entity.getSummary(),
                entity.getEmbedding()
        );
    }
}
