package com.natane.common.excepiton;

import com.natane.common.excepiton.base.BaseException;

/**
 * 业务异常响应
 *
 * @author natane
 * @date 2022/6/26
 */
public class BusinessException extends BaseException {

    /**
     * 响应码
     */
    private int code;

    public BusinessException() {
    }


    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
