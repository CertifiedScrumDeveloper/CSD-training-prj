package com.csd.training.entity;

/**
 * Created by hanli on 2017/8/27.
 */
public class Place {

    private Integer id;

    private String name;

    private Integer courtId;

    private Double unitPrice;

    boolean[] reverseTimeArray = new boolean[24];

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourtId() {
        return courtId;
    }

    public void setCourtId(Integer courtId) {
        this.courtId = courtId;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean[] getReverseTimeArray() {
        return reverseTimeArray;
    }

    public void setReverseTimeArray(boolean[] reverseTimeArray) {
        this.reverseTimeArray = reverseTimeArray;
    }
}
