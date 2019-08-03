package com.hong.coolweather.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.hong.coolweather.db.City;
import com.hong.coolweather.db.County;
import com.hong.coolweather.db.Province;
import com.hong.coolweather.gson.AQI;
import com.hong.coolweather.gson.WeatherBean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provincesJSONObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provincesJSONObject.getString("name"));
                    province.setProvinceCode(provincesJSONObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response, int provincedId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allcities = new JSONArray(response);
                for (int i = 0; i < allcities.length(); i++) {
                    JSONObject provincesJSONObject = allcities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(provincesJSONObject.getString("name"));
                    city.setCityCode(provincesJSONObject.getInt("id"));
                    city.setProvinceId(provincedId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject provincesJSONObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(provincesJSONObject.getString("name"));
                    county.setWeatherId(provincesJSONObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 将返回的JSON数据解析成Weather实体类
     */
    public static WeatherBean handleWeatherResponse(String response) {
        try {
            JSONObject object = new JSONObject(response);
            JSONArray jsonArray = object.getJSONArray("HeWeather6");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent, WeatherBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解析AQI空气质量
     * @param responseText
     * @return
     */
    public static AQI handleAQIResponse(String responseText) {
            return new Gson().fromJson(responseText, AQI.class);
    }
}
