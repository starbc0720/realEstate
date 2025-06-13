package com.realEstate.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public enum BuildType {
    SALE("SALE", "판매"),
    RENT("RENT", "월세"),
    JEONSE("JEONSE", "전세");

    private final String code;
    private final String label;

    BuildType(String code, String label) {
        this.code = code;
        this.label = label;
    }

    private static final Map<String, BuildType> CODE_MAP = Arrays.stream(BuildType.values())
            .collect(Collectors.toMap(
                    type -> type.code.toUpperCase(),
                    Function.identity()
            ));

    public static BuildType fromCode(String code){
        if(code == null) return null;
        BuildType type = CODE_MAP.get(code.toUpperCase());
        if(type == null){
            throw new IllegalArgumentException("Invalid BuildType code : " + type);
        }
        return type;
    }
}
