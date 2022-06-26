package com.natane.common.asserts;

import org.springframework.lang.Nullable;

import java.util.function.Function;

/**
 * 业务对象断言类
 * 可对data对象进行断言
 * 支持链式
 *
 * @author natane
 * @date 2022/6/26
 */
public class ObjBizAssert<T> {

    /**
     * 数据对象
     */
    private final T data;


    public ObjBizAssert(T data) {
        this.data = data;
    }


    /**
     * 断言布尔表达式，如果为false则抛出异常
     *
     * @param function function
     * @param code     响应码
     * @param message  响应消息
     * @return 断言对象
     */
    public ObjBizAssert<T> isTrue(Function<T, Boolean> function, int code, String message) {
        BizAssert.isTrue(function.apply(this.data), code, message);
        return this;
    }


    /**
     * 断言布尔表达式，如果为false则抛出异常
     *
     * @param expression 布尔表达式
     * @param code       响应码
     * @param message    响应消息
     * @return 断言对象
     */
    public ObjBizAssert<T> isTrue(boolean expression, int code, String message) {
        BizAssert.isTrue(expression, code, message);
        return this;
    }

    /**
     * 断言布尔表达式，如果为true则抛出异常
     *
     * @param function function
     * @param code     响应码
     * @param message  响应消息
     * @return 断言对象
     */
    public ObjBizAssert<T> isNotTrue(Function<T, Boolean> function, int code, String message) {
        BizAssert.isNotTrue(function.apply(this.data), code, message);
        return this;
    }

    /**
     * 断言布尔表达式，如果为true则抛出异常
     *
     * @param expression 布尔表达式
     * @param code       响应码
     * @param message    响应消息
     * @return 断言对象
     */
    public ObjBizAssert<T> isNotTrue(boolean expression, int code, String message) {
        BizAssert.isNotTrue(expression, code, message);
        return this;
    }


    /**
     * 断言对象为null，如果不为null则抛出异常
     *
     * @param obj     布尔表达式
     * @param code    响应码
     * @param message 响应消息
     */
    public ObjBizAssert<T> isNull(@Nullable Object obj, int code, String message) {
        BizAssert.isNull(obj, code, message);
        return this;
    }

    /**
     * 断言对象为null，如果不为null则抛出异常
     *
     * @param function function
     * @param code     响应码
     * @param message  响应消息
     */
    public ObjBizAssert<T> isNull(Function<T, Object> function, int code, String message) {
        BizAssert.isNull(function.apply(this.data), code, message);
        return this;
    }


    /**
     * 断言对象不为null，如果为null则抛出异常
     *
     * @param obj     布尔表达式
     * @param code    响应码
     * @param message 响应消息
     */
    public ObjBizAssert<T> isNotNull(@Nullable Object obj, int code, String message) {
        BizAssert.isNotNull(obj, code, message);
        return this;
    }

    /**
     * 断言对象不为null，如果为null则抛出异常
     *
     * @param function function
     * @param code     响应码
     * @param message  响应消息
     */
    public ObjBizAssert<T> isNotNull(Function<T, Object> function, int code, String message) {
        BizAssert.isNotNull(function.apply(this.data), code, message);
        return this;
    }


    /**
     * 断言字符串对象为空或空串，如果不为空或空串则抛出异常
     *
     * @param str     字符串
     * @param code    响应码
     * @param message 响应消息
     */
    public ObjBizAssert<T> isEmpty(@Nullable String str, int code, String message) {
        BizAssert.isEmpty(str, code, message);
        return this;
    }

    /**
     * 断言字符串对象为空或空串，如果不为空或空串则抛出异常
     *
     * @param function function
     * @param code     响应码
     * @param message  响应消息
     */
    public ObjBizAssert<T> isEmpty(Function<T, String> function, int code, String message) {
        BizAssert.isEmpty(function.apply(this.data), code, message);
        return this;
    }


    /**
     * 断言字符串对象不为空或空串，如果为空或空串则抛出异常
     *
     * @param str     字符串
     * @param code    响应码
     * @param message 响应消息
     */
    public ObjBizAssert<T> isNotEmpty(@Nullable String str, int code, String message) {
        BizAssert.isNotEmpty(str, code, message);
        return this;
    }

    /**
     * 断言字符串对象不为空或空串，如果为空或空串则抛出异常
     *
     * @param function function
     * @param code     响应码
     * @param message  响应消息
     */
    public ObjBizAssert<T> isNotEmpty(Function<T, String> function, int code, String message) {
        BizAssert.isNotEmpty(function.apply(this.data), code, message);
        return this;
    }


    /**
     * 检查字符串是否不为空串、不为空且内容不为空格。
     *
     * @param str     字符串
     * @param code    响应码
     * @param message 响应消息
     */
    public ObjBizAssert<T> isBlank(@Nullable String str, int code, String message) {
        BizAssert.isNotBlank(str, code, message);
        return this;
    }


    /**
     * 检查字符串是否不为空串、不为空且内容不为空格。
     *
     * @param function function
     * @param code     响应码
     * @param message  响应消息
     */
    public ObjBizAssert<T> isBlank(Function<T, String> function, int code, String message) {
        BizAssert.isNotBlank(function.apply(this.data), code, message);
        return this;
    }


    /**
     * 检查字符串是否为空串、为空或内容为空格。
     *
     * @param str     字符串
     * @param code    响应码
     * @param message 响应消息
     */
    public ObjBizAssert<T> isNotBlank(@Nullable String str, int code, String message) {
        BizAssert.isBlank(str, code, message);
        return this;
    }


    /**
     * 检查字符串是否为空串、为空或内容为空格。
     *
     * @param function function
     * @param code     响应码
     * @param message  响应消息
     */
    public ObjBizAssert<T> isNotBlank(Function<T, String> function, int code, String message) {
        BizAssert.isBlank(function.apply(this.data), code, message);
        return this;
    }
}
