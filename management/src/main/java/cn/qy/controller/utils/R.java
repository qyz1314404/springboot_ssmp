package cn.qy.controller.utils;

import lombok.Data;

/**
 * @description:
 * @author: QiuYang
 * @time: 2022/3/31
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;
    public R() {

    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }
}
