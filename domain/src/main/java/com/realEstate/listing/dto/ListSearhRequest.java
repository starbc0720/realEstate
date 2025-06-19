package com.realEstate.listing.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

public record ListSearhRequest(
        String title,

        Long lowPrice,

        Long highPrice,

        @Schema(description = "위치", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank(message = "위치 입력은 필수입니다")
        String loc,

        Float lowArea,

        Float highArea,

        String type,

        Integer fromConstructionYear,

        Integer toConstructionYear
) {}
