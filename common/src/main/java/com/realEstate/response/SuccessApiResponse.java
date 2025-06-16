package com.realEstate.response;

import lombok.Getter;

@Getter
public class SuccessApiResponse<T> extends  ApiResponse {

    private T data;

    public SuccessApiResponse(int status, T data) {
        super(status);
        this.data = data;
    }

    // 반환할 데이터가 없는 경우(상태코드만 return)
    public static <T> SuccessApiResponse<T> of(int status){
        return new SuccessApiResponse<>(status, null);
    };

    // 반활할 데이터 있는 경우
    public static <T> SuccessApiResponse<T> of(int status, T data){
        return new SuccessApiResponse<>(status, data);
    }
}
