package com.example.swordsman.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by swordsman on 2017/9/21.
 */

public class Weather {
    public String status;
    public Basic basic;
    public  AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
