package com.natane.common.asserts;

import com.natane.common.excepiton.BusinessException;

import java.util.function.Function;

/**
 * 业务断言
 *
 * @author natane
 * @date 2022/6/26
 */
public class BusinessAssert<T> {

    /**
     * 数据对象
     */
    private T data;

    private BusinessAssert() {
    }

    private BusinessAssert<T> setData(T data) {
        this.data = data;
        return this;
    }

    /**
     * 获取断言对象，针对单个对象进行校验
     *
     * @param data 数据对象
     * @param <T>  对象类型
     * @return 断言
     */
    public static <T> BusinessAssert<T> getAssert(T data) {
        return new BusinessAssert<T>().setData(data);
    }


    /**
     * 断言布尔表达式，如果为false则抛出异常
     *
     * @param expression 布尔表达式
     * @param code       异常响应码
     * @param message    异常信息
     * @throws BusinessException 业务异常
     */
    public static void isTrue(boolean expression, int code, String message) {
        if (!expression) {
            throw new BusinessException(code, message);
        }
    }

    public <R> BusinessAssert<T> isTrue(Function<T, R> function, int code, String message) {
        R apply = function.apply(this.data);
        if (apply instanceof Boolean result) {
            if (!result) {
                throw new BusinessException(code, message);
            } else {
                return this;
            }
        }
        throw new BusinessException(10000, "传入对象类型不匹配");
    }


    /**
     * @param expression 布尔表达式
     * @param code       异常响应码
     * @param message    异常信息
     * @throws BusinessException 业务异常
     */
    public static void isNotTrue(boolean expression, int code, String message) {
        if (expression) {
            throw new BusinessException(code, message);
        }
    }


}
