package com.iyou.exception;

/**
 * 身份认证异常
 * @author iyou
 * @since 2018-05-06
 */
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String msg) {
        super(msg);
    }

    public UnauthorizedException() {
        super();
    }
}
