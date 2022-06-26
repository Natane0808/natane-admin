package com.natane.common.excepiton;

import com.natane.common.excepiton.base.BaseException;

/**
 * 业务异常响应
 *
 * @author natane
 * @date 2022/6/26
 */
public class BizException extends BaseException {

    /**
     * 响应码
     */
    private int code;

    public BizException() {
    }


    public BizException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
