package com.realEstate.listing.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ListSearchRequest {
    String title;

    Long lowPrice;

    Long highPrice;

    @Schema(description = "위치", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "위치 입력은 필수입니다")
    String loc;

    Float lowArea;

    Float highArea;

    String type;

    Integer fromConstructionYear;

    Integer toConstructionYear;
}
