package com.natane.common.entity;

import com.natane.common.constant.ResultCode;
import com.natane.common.utils.StringUtils;

import java.io.Serial;
import java.util.HashMap;

/**
 * 接口统一消息响应类
 *
 * @author natane
 * @date 2022/6/25
 */
public class Result extends HashMap<String, Object> {

    @Serial
    private static final long serialVersionUID = -7407810730608157069L;

    /**
     * 是否成功
     */
    public static final String IS_SUCCESS = "success";

    /**
     * 状态码
     */
    public static final String CODE = "code";

    /**
     * 返回内容
     */
    public static final String MSG = "msg";

    /**
     * 数据对象
     */
    public static final String DATA = "data";

    /**
     * 私有化无参构造方法
     */
    private Result() {
    }

    /**
     * 初始化一个新创建的 Result 对象
     *
     * @param isSuccess 是否成功
     * @param code      状态码
     * @param msg       返回内容
     */
    public Result(boolean isSuccess, int code, String msg) {
        super.put(IS_SUCCESS, isSuccess);
        super.put(CODE, code);
        super.put(MSG, msg);
    }

    /**
     * 初始化一个新创建的 Result 对象
     *
     * @param isSuccess 是否成功
     * @param code      状态码
     * @param msg       返回内容
     * @param data      数据对象
     */
    public Result(boolean isSuccess, int code, String msg, Object data) {
        super.put(IS_SUCCESS, isSuccess);
        super.put(CODE, code);
        super.put(MSG, msg);
        if (StringUtils.isNotNull(data)) {
            super.put(DATA, data);
        }
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static Result success() {
        return Result.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static Result success(Object data) {
        return Result.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static Result success(String msg) {
        return Result.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static Result success(String msg, Object data) {
        return new Result(true, ResultCode.SUCCESS, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return 错误消息
     */
    public static Result error() {
        return Result.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 错误消息
     */
    public static Result error(String msg) {
        return Result.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 错误消息
     */
    public static Result error(String msg, Object data) {
        return new Result(false, ResultCode.ERROR, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 错误消息
     */
    public static Result error(int code, String msg) {
        return new Result(false, code, msg, null);
    }

    /**
     * 方便链式调用
     *
     * @param key   键
     * @param value 值
     * @return 数据对象
     */
    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
