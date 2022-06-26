package com.natane.common.excepiton.handler;

import com.natane.common.constant.ResultCode;
import com.natane.common.entity.Result;
import com.natane.common.excepiton.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 通用异常处理方法
     **/
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.error(); // 通用异常结果
    }

    /**
     * 空指针异常处理方法
     **/
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public Result error(NullPointerException e) {
        e.printStackTrace();
        return Result.error(ResultCode.NULL_POINTER, "空指针异常！");
    }


    /**
     * 业务异常处理方法
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result error(BusinessException e) {
        e.printStackTrace();
        return Result.error(e.getCode(), e.getMessage());
    }
}