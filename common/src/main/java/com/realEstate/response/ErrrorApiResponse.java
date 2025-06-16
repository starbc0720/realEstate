package com.realEstate.response;

import lombok.Getter;

@Getter
public class ErrrorApiResponse extends ApiResponse {

    private String msg;

    public ErrrorApiResponse(int status, String msg) {
        super(status);
        this.msg = msg;
    }

    public static ErrrorApiResponse of(int status, String msg) {
        return new ErrrorApiResponse(status, msg);
    }
}
