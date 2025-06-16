package com.realEstate.listing.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

public record ListSearchRequest(
        Long price,

        @Schema(description = "지역", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "지역 선택은 필수입니다")
        String loc,

        Float area,

        @Schema(description = "타입", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "타입 지정은 필수입니다")
        String type,

        Integer floor
) { }
