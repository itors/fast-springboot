package com.itors.fastspringboot.dto;

import java.io.Serializable;

public class BaseDto implements Serializable {

    /**
     *
     * 每页显示的条数
     *  默认 10 条
     */
    private Integer size = 10;
    /**
     *
     * 当前页
     *  默认第一页
     */
    private Integer current = 1;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }
}
