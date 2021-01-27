package com.deri.demo.common;

import lombok.AllArgsConstructor;

/**
 * @ClassName: Code
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2021/1/21 19:03
 * @Version: v1.0
 **/
@AllArgsConstructor
public enum Code {
    SUCCESS(200, "请求成功"),
    FAILD(201, "请求失败"),
    USERNAME_REPEAT(202, "用户名重复."),
    USERAGE_LIMIT(203, "用户太小."),

    ;
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }}
