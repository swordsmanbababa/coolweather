package com.example.swordsman.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by swordsman on 2017/9/19.
 */

public class City extends DataSupport {
    private int id;
    private String name;
    private int cityCode;
    private int  provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
