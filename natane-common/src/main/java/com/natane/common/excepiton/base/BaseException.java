package com.natane.common.excepiton.base;

import java.io.Serial;

/**
 * 基础异常类
 *
 * @author natane
 * @date 2022/6/26
 */
public class BaseException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 2872255055771690116L;

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }
}
