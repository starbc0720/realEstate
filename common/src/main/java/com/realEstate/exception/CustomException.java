package com.realEstate.exception;

import com.realEstate.enums.ErrorCode;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    private final ErrorCode errorCode;

    // CustomException에 정의해놓은 기본 메시지 사용
    public CustomException(ErrorCode errorCode){
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }

    // 직접 생성한 예외 메시지 오버라이드
    public CustomException(ErrorCode errorCode, String customMsg) {
        super(customMsg);
        this.errorCode=errorCode;
    }
}
