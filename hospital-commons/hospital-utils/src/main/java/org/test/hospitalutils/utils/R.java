package org.test.hospitalutils.utils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.test.hospitalutils.entity.ResultCode;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {

    @ApiModelProperty(value = "是否成功")
    private boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<>();

    private R() {
    }

    public static R ok(String message, Map<String, Object> data) {
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS_CODE);
        r.setMessage(message);
        r.setData(data);
        return r;
    }

    public static R ok() {
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS_CODE);
        return r;
    }

    public static R error() {
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.FAILURE_CODE);
        return r;
    }


    public static R error(String message, Map<String, Object> data) {
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.FAILURE_CODE);
        r.setMessage(message);
        r.setData(data);
        return r;
    }

    public R success(boolean success) {
        this.success = success;
        return this;
    }

    public R message(String message) {
        this.message = message;
        return this;
    }

    public R code(Integer code) {
        this.code = code;
        return this;
    }

    public R data(String message, Object o) {
        this.data.put(message, o);
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
    
}
