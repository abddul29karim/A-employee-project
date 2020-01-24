package com.btpn.employee.Dao;

public class DaoResponse<T extends Object> {
    private int code;
    private String status;
    private String messagae;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessagae() {
        return messagae;
    }

    public void setMessagae(String messagae) {
        this.messagae = messagae;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
