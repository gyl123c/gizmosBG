package com.gyl.bg.gizmos.entity;

import com.gyl.bg.gizmos.constants.Constants;
import com.gyl.bg.gizmos.util.StringUtil;

public class InterfaceRsp {
    private String code;
    private String msg;
    private Object data;

    public InterfaceRsp success() {
        return success(null, null);
    }

    public InterfaceRsp success(String msg) {
        return success(msg, null);
    }

    public InterfaceRsp success(Object data) {
        return success(null, data);
    }

    public InterfaceRsp success(String msg, Object data) {
        msg = StringUtil.isEmpty(msg) ? Constants.INTERFACE_SUCCESS_MSG : msg;
        setCode(Constants.INTERFACE_SUCCESS_CODE);
        setMsg(msg);
        setData(data);
        return this;
    }

    public InterfaceRsp fail() {
        return fail(null, null, null);
    }

    public InterfaceRsp fail(String code) {
        return fail(code, null, null);
    }

    public InterfaceRsp fail(String code, String msg) {
        return fail(code, msg, null);
    }

    public InterfaceRsp fail(String code, String msg, Object data) {
        code = StringUtil.isEmpty(code) ? Constants.INTERFACE_FAIL_CODE : code;
        msg = StringUtil.isEmpty(msg) ? Constants.INTERFACE_FAIL_MSG : msg;
        setCode(code);
        setMsg(msg);
        setData(data);
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
