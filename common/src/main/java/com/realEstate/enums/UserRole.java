package com.realEstate.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public enum UserRole {
    ADMIN("ADMIN", "꽌리자"),
    MANAGER("MANAGER", "매니저"),
    USER("USER", "사용자"),
    GUEST("GUEST", "비회원");

    private final String code;
    private final String label;

    UserRole(String code, String label) {
        this.code = code;
        this.label = label;
    }

    private static final Map<String, UserRole> CODE_MAP = Arrays.stream(UserRole.values())
            .collect(Collectors.toMap(
                    role -> role.code.toUpperCase(),
                    Function.identity()
            ));

    public static UserRole fromCode(String code){
        if(code == null) return null;
        UserRole role = CODE_MAP.get(code.toUpperCase());
        if(role == null){
            throw new IllegalArgumentException("Invalid UserRole code : " + code);
        }
        return role;
    }
}
