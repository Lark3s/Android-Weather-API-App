package rs.ac.singidunum.weatherapiapp;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataService {

    public static final String QUERY_FOR_CITY_NAME = "http://api.weatherbit.io/v2.0/current?city=";
    public static final String API_KEY = "";
    public static final String QUERY_FOR_16DAY_FORECAST = "https://api.weatherbit.io/v2.0/forecast/daily?city=";

    Context context;
    String cityCC;
    String cityLat;
    String cityLon;

    public WeatherDataService(Context context) {
        this.context = context;
    }

    public interface VolleyResponseListener {
        void onError(String message);

        void onResponse(String cityCC, String cityLat, String cityLon);
    }

    public void getCityCountryCode(String cityName, VolleyResponseListener volleyResponseListener) {
        String url = QUERY_FOR_CITY_NAME + cityName + API_KEY;

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                cityCC = "";

                try {
                    JSONArray cityInfo = response.getJSONArray("data");
                    JSONObject cityInfo2 = cityInfo.getJSONObject(0);
                    cityCC = cityInfo2.getString("country_code");
                    cityLat = cityInfo2.getString("lat");
                    cityLon = cityInfo2.getString("lon");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                volleyResponseListener.onResponse(cityCC, cityLat, cityLon);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                volleyResponseListener.onError("Something wrong");
            }
        });

        MySingleton.getInstance(context).addToRequestQueue(request);

    }

    public interface ForecastByNameResponse {
        void onError(String message);

        void onResponse(List<WeatherReportModel> weatherReportModels);
    }

    public void getWeatherByLatLon(String cityName, ForecastByNameResponse forecastByNameResponse) {
        List<WeatherReportModel> weatherReportModels = new ArrayList<>();

        String url = QUERY_FOR_16DAY_FORECAST + cityName + API_KEY;

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

//                Toast.makeText(context, response.toString(), Toast.LENGTH_SHORT).show();

                try {
                    JSONArray data = response.getJSONArray("data");

                    //get first item




                    for (int i = 0; i < data.length(); i++) {

                        WeatherReportModel one_day_weather = new WeatherReportModel();
                        JSONObject one_day_from_api = data.getJSONObject(i);


                        one_day_weather.setMoonrise_ts(one_day_from_api.getInt("moonrise_ts"));
                        one_day_weather.setWind_cdir(one_day_from_api.getString("wind_cdir"));
                        one_day_weather.setRh(one_day_from_api.getInt("rh"));
                        one_day_weather.setPres(one_day_from_api.getLong("pres"));
                        one_day_weather.setHigh_temp(one_day_from_api.getLong("high_temp"));
                        one_day_weather.setSunset_ts(one_day_from_api.getInt("sunset_ts"));
                        one_day_weather.setOzone(one_day_from_api.getLong("ozone"));
                        one_day_weather.setMoon_phase(one_day_from_api.getLong("moon_phase"));
                        one_day_weather.setWind_gust_spd(one_day_from_api.getLong("wind_gust_spd"));
                        one_day_weather.setSnow_depth(one_day_from_api.getInt("snow_depth"));
                        one_day_weather.setClouds(one_day_from_api.getInt("clouds"));
                        one_day_weather.setTs(one_day_from_api.getInt("ts"));
                        one_day_weather.setSunrise_ts(one_day_from_api.getInt("sunrise_ts"));
                        one_day_weather.setApp_min_temp(one_day_from_api.getLong("app_min_temp"));
                        one_day_weather.setWind_spd(one_day_from_api.getLong("wind_spd"));
                        one_day_weather.setPop(one_day_from_api.getInt("pop"));
                        one_day_weather.setWind_cdir_full(one_day_from_api.getString("wind_cdir_full"));
                        one_day_weather.setSlp(one_day_from_api.getLong("slp"));
                        one_day_weather.setMoon_phase_lunation(one_day_from_api.getLong("moon_phase_lunation"));
                        one_day_weather.setValid_date(one_day_from_api.getString("valid_date"));
                        one_day_weather.setApp_max_temp(one_day_from_api.getLong("app_max_temp"));
                        one_day_weather.setVis(one_day_from_api.getLong("vis"));
                        one_day_weather.setDewpt(one_day_from_api.getLong("dewpt"));
                        one_day_weather.setSnow(one_day_from_api.getInt("snow"));
                        one_day_weather.setUv(one_day_from_api.getLong("uv"));
                        one_day_weather.setWeather(one_day_from_api.getJSONObject("weather"));
                        one_day_weather.setWind_dir(one_day_from_api.getInt("wind_dir"));
                        one_day_weather.setMax_dhi(one_day_from_api.getString("max_dhi"));
                        one_day_weather.setClouds_hi(one_day_from_api.getInt("clouds_hi"));
                        one_day_weather.setPrecip(one_day_from_api.getLong("precip"));
                        one_day_weather.setLow_temp(one_day_from_api.getLong("low_temp"));
                        one_day_weather.setMax_temp(one_day_from_api.getLong("max_temp"));
                        one_day_weather.setMoonset_ts(one_day_from_api.getInt("moonset_ts"));
                        one_day_weather.setDatetime(one_day_from_api.getString("datetime"));
                        one_day_weather.setTemp(one_day_from_api.getLong("temp"));
                        one_day_weather.setMin_temp(one_day_from_api.getLong("min_temp"));
                        one_day_weather.setClouds_mid(one_day_from_api.getInt("clouds_mid"));
                        one_day_weather.setClouds_low(one_day_from_api.getInt("clouds_low"));

                        weatherReportModels.add(one_day_weather);

                    }
                    forecastByNameResponse.onResponse(weatherReportModels);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        MySingleton.getInstance(context).addToRequestQueue(request);
    }


//
//    public List<WeatherReportModel> getForecastByPostalCode(String cityID) {
//
//    }
}
