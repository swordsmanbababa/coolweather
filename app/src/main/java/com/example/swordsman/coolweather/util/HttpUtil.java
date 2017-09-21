package com.example.swordsman.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by swordsman on 2017/9/19.
 */

public class HttpUtil {
    public static void sentokHttpRequest(String adress,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}
