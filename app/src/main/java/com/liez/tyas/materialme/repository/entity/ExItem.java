package com.liez.tyas.materialme.repository.entity;

import java.util.Date;

/**
 * Created by tyasrus on 09/05/16.
 */
public class ExItem {

    private String name;
    private String value;
    private int amount;
    private Date createdDate;

    public ExItem(String name, String value, int amount, Date createdDate) {
        this.name = name;
        this.value = value;
        this.amount = amount;
        this.createdDate = createdDate;
    }

    public ExItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "ExItem{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", amount=" + amount +
                ", createdDate=" + createdDate +
                '}';
    }
}
