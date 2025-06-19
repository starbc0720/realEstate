package com.realEstate.exception;

import com.realEstate.enums.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ErrorResponse {

    private final String code;
    private final String msg;

    public static ErrorResponse of(ErrorCode errorCode){
        return new ErrorResponse(errorCode.getCode(), errorCode.getMsg());
    }
}
