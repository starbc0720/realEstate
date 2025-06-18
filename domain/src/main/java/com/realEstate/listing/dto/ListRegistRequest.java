package com.realEstate.listing.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record ListRegistRequest(
        @Schema(description = "매물명", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "매물명 입력은 필수입니다")
        String title,

        String description,

        @Schema(description = "가격", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull(message = "가격 입력은 필수입니다")
        Long price,

        @Schema(description = "위치", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "위치 입력은 필수입니다")
        String loc,

        Float area,

        @Schema(description = "타입", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "타입 지정은 필수입니다")
        String type,

        @Schema(description = "층수", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull(message = "층수 입력은 필수입니다")
        Integer floor,

        @Schema(description = "층수", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "층수 입력은 필수입니다")
        String fType,

        String summary,

        String embedding,

        String createdBy,

        String updatedBy
) { }
