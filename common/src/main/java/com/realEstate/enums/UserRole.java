package com.realEstate.enums;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("꽌리자"),
    MANAGER("매니저"),
    USER("사용자");

    private final String label;

    UserRole(String label) {
        this.label = label;
    }
}
