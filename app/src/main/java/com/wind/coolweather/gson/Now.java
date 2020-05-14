package com.wind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("temp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public  class More{
        @SerializedName("txt")
        public String info;
    }
}
