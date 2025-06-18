package com.realEstate.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public enum BuildType {
    SALE("SALE", "판매"),
    RENT("RENT", "월세"),
    JEONSE("JEONSE", "전세");

    private final String code;
    private final String label;

    private static final Map<String, BuildType> LABEL_MAP = Arrays.stream(values())
            .collect(Collectors.toMap(
                    BuildType::getLabel,
                    Function.identity()
            ));

    private static final Map<String, BuildType> CODE_MAP = Arrays.stream(BuildType.values())
            .collect(Collectors.toMap(
                    type -> type.code.toUpperCase(),
                    Function.identity()
            ));

    public static BuildType fromLabel(String label){
        if(label == null) return null;
        BuildType type = LABEL_MAP.get(label);
        if(type == null){
            throw new IllegalArgumentException("Invalid BuildType label: " + label);
        }
        return type;
    }

    public static BuildType fromCode(String code){
        if(code == null) return null;
        BuildType type = CODE_MAP.get(code.toUpperCase());
        if(type == null){
            throw new IllegalArgumentException("Invalid BuildType code : " + code);
        }
        return type;
    }
}
