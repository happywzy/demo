package com.deri.demo.dto;

import com.deri.demo.common.Code;
import lombok.Data;

/**
 * @ClassName: BaseResponse
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2021/1/21 19:02
 * @Version: v1.0
 **/
@Data
public class BaseResponse {
    private int code;
    private String msg;

    public BaseResponse(Code code) {
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public void setCodeAndMsg(Code code) {
        this.code = code.getCode();
        this.msg = code.getMsg();
    }
}
