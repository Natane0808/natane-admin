package com.natane.common.asserts;

import com.natane.common.excepiton.BizException;
import com.natane.common.utils.StringUtils;
import org.springframework.lang.Nullable;

/**
 * 业务断言
 *
 * @author natane
 * @date 2022/6/26
 */
public class BizAssert {

    private BizAssert() {
    }

    /**
     * 断言布尔表达式，如果为false则抛出异常
     *
     * @param expression 布尔表达式
     * @param code       异常响应码
     * @param message    异常信息
     * @throws BizException 业务异常
     */
    public static void isTrue(boolean expression, int code, String message) {
        if (!expression) {
            throw new BizException(code, message);
        }
    }


    /**
     * @param expression 布尔表达式
     * @param code       异常响应码
     * @param message    异常信息
     * @throws BizException 业务异常
     */
    public static void isNotTrue(boolean expression, int code, String message) {
        if (expression) {
            throw new BizException(code, message);
        }
    }

    /**
     * 断言对象为null，如果不为null则抛出异常
     *
     * @param obj     对象
     * @param code    响应码
     * @param message 响应消息
     */
    public static void isNull(@Nullable Object obj, int code, String message) {
        if (obj != null) {
            throw new BizException(code, message);
        }
    }


    /**
     * 断言对象不为null，如果为null则抛出异常
     *
     * @param obj     对象
     * @param code    响应码
     * @param message 响应消息
     */
    public static void isNotNull(@Nullable Object obj, int code, String message) {
        if (obj == null) {
            throw new BizException(code, message);
        }
    }


    /**
     * 断言字符串对象为空或空串，如果不为空或空串则抛出异常
     *
     * @param str     字符串
     * @param code    响应码
     * @param message 响应消息
     */
    public static void isEmpty(@Nullable String str, int code, String message) {
        if (StringUtils.isNotEmpty(str)) {
            throw new BizException(code, message);
        }
    }


    /**
     * 断言字符串对象不为空或空串，如果为空或空串则抛出异常
     *
     * @param str     字符串
     * @param code    响应码
     * @param message 响应消息
     */
    public static void isNotEmpty(@Nullable String str, int code, String message) {
        if (StringUtils.isEmpty(str)) {
            throw new BizException(code, message);
        }
    }


    /**
     * 检查字符串是否不为空串、不为空且内容不为空格。
     *
     * @param str     字符串
     * @param code    响应码
     * @param message 响应消息
     */
    public static void isBlank(@Nullable String str, int code, String message) {
        if (StringUtils.isNotBlank(str)) {
            throw new BizException(code, message);
        }
    }


    /**
     * 检查字符串是否为空串、为空或内容为空格。
     *
     * @param str     字符串
     * @param code    响应码
     * @param message 响应消息
     */
    public static void isNotBlank(@Nullable String str, int code, String message) {
        if (StringUtils.isBlank(str)) {
            throw new BizException(code, message);
        }
    }

}
