package com.tanben.jobhunting.bean;


public class Result<T> implements java.io.Serializable {

    private static final long serialVersionUID = -4615871111681345393L;
    private int code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public static <T> Result getSuccess(String msg, T data) {
        return new Result<T>(1, msg, data);
    }

    public static <T> Result getSuccess(String msg) {
        return new Result<T>(1, msg);
    }

    public static <T> Result getSuccess(T data) {
        return new Result<T>(1, data);
    }

    public static <T> Result getFailed(String msg) {
        return new Result(0, msg);
    }

    public static <T> Result getFailed(String msg, T data) {
        return new Result(0, msg, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
