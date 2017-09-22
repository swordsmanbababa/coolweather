package com.example.swordsman.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;

/**
 * Created by swordsman on 2017/9/21.
 */

public class Suggestion {
    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("cw")
    public CardWash cardWash;
    public Sport sport;

    public  class Comfort{
        @SerializedName("txt")
        public String info;
    }

   public  class CardWash{
       @SerializedName("txt")
       public  String  info;
   }
   public class Sport{
       @SerializedName("txt")
       public String info;
   }
}
