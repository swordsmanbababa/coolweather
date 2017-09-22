package com.example.swordsman.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by swordsman on 2017/9/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
     public String weatherId;
   public Update update;

public class Update{
     @SerializedName("loc")
    public String updateTime;
}
}
