package com.realEstate.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    // 예외 코드 신규로 정의 할 게 있으면 밑에 정의하면 됨
    INVALID_REQUEST("E001", HttpStatus.BAD_REQUEST, "유효하지 않은 코드입니다"),
    NOT_FOUND("E002", HttpStatus.NOT_FOUND, "존재하지 않는 리소스입니다"),
    UNAUTHORIZED("E003", HttpStatus.UNAUTHORIZED, "로그인이 필요한 서비스입니다"),
    FORBIDDEN("E004", HttpStatus.FORBIDDEN, "허용되지 않은 사용자입니다"),
    INVALID_BUILD_TYPE("E100", HttpStatus.BAD_REQUEST, "유효하지 않은 건물유형 코드입니다");


    private final String code;
    private final HttpStatus status;
    private final String msg;
}
