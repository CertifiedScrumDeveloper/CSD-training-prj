package com.csd.training.entity;

/**
 * Created by hanli on 2017/8/27.
 */
public class Player {

    private Integer id;

    private String name;

    private boolean isVip;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }
}
