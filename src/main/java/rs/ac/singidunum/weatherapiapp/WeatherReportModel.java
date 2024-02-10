package rs.ac.singidunum.weatherapiapp;

import org.json.JSONObject;

public class WeatherReportModel {

    private int moonrise_ts;
    private String wind_cdir;
    private int rh;
    private long pres;
    private long high_temp;
    private int sunset_ts;
    private long ozone;
    private long moon_phase;
    private long wind_gust_spd;
    private int snow_depth;
    private int clouds;
    private int ts;
    private int sunrise_ts;
    private long app_min_temp;
    private long wind_spd;
    private int pop;
    private String wind_cdir_full;
    private long slp;
    private long moon_phase_lunation;
    private String valid_date;
    private long app_max_temp;
    private long vis;
    private long dewpt;
    private int snow;
    private long uv;
    private JSONObject weather;
    private int wind_dir;
    private String max_dhi; // DEPRECATED ALWAYS IS NULL
    private int clouds_hi;
    private long precip;
    private  long low_temp;
    private long max_temp;
    private int moonset_ts;
    private String datetime;
    private long temp;
    private long min_temp;
    private int clouds_mid;
    private int clouds_low;

    public WeatherReportModel(int moonrise_ts, String wind_cdir, int rh, long pres, long high_temp, int sunset_ts, long ozone, int moon_phase, long wind_gust_spd, int snow_depth, int clouds, int ts, int sunrise_ts, long app_min_temp, long wind_spd, int pop, String wind_cdir_full, long slp, long moon_phase_lunation, String valid_date, long app_max_temp, long vis, long dewpt, int snow, long uv, JSONObject weather, int wind_dir, String max_dhi, int clouds_hi, long precip, int low_temp, long max_temp, int moonset_ts, String datetime, long temp, long min_temp, int clouds_mid, int clouds_low) {
        this.moonrise_ts = moonrise_ts;
        this.wind_cdir = wind_cdir;
        this.rh = rh;
        this.pres = pres;
        this.high_temp = high_temp;
        this.sunset_ts = sunset_ts;
        this.ozone = ozone;
        this.moon_phase = moon_phase;
        this.wind_gust_spd = wind_gust_spd;
        this.snow_depth = snow_depth;
        this.clouds = clouds;
        this.ts = ts;
        this.sunrise_ts = sunrise_ts;
        this.app_min_temp = app_min_temp;
        this.wind_spd = wind_spd;
        this.pop = pop;
        this.wind_cdir_full = wind_cdir_full;
        this.slp = slp;
        this.moon_phase_lunation = moon_phase_lunation;
        this.valid_date = valid_date;
        this.app_max_temp = app_max_temp;
        this.vis = vis;
        this.dewpt = dewpt;
        this.snow = snow;
        this.uv = uv;
        this.weather = weather;
        this.wind_dir = wind_dir;
        this.max_dhi = max_dhi;
        this.clouds_hi = clouds_hi;
        this.precip = precip;
        this.low_temp = low_temp;
        this.max_temp = max_temp;
        this.moonset_ts = moonset_ts;
        this.datetime = datetime;
        this.temp = temp;
        this.min_temp = min_temp;
        this.clouds_mid = clouds_mid;
        this.clouds_low = clouds_low;
    }

    public WeatherReportModel() {
    }

    @Override
    public String toString() {
        return
                "moonrise_ts=" + moonrise_ts +
                ", wind_cdir='" + wind_cdir + '\'' +
                ", rh=" + rh +
                ", pres=" + pres +
                ", high_temp=" + high_temp +
                ", sunset_ts=" + sunset_ts +
                ", ozone=" + ozone +
                ", moon_phase=" + moon_phase +
                ", wind_gust_spd=" + wind_gust_spd +
                ", snow_depth=" + snow_depth +
                ", clouds=" + clouds +
                ", ts=" + ts +
                ", sunrise_ts=" + sunrise_ts +
                ", app_min_temp=" + app_min_temp +
                ", wind_spd=" + wind_spd +
                ", pop=" + pop +
                ", wind_cdir_full='" + wind_cdir_full + '\'' +
                ", slp=" + slp +
                ", moon_phase_lunation=" + moon_phase_lunation +
                ", valid_date='" + valid_date + '\'' +
                ", app_max_temp=" + app_max_temp +
                ", vis=" + vis +
                ", dewpt=" + dewpt +
                ", snow=" + snow +
                ", uv=" + uv +
                ", weather=" + weather +
                ", wind_dir=" + wind_dir +
                ", max_dhi=" + max_dhi +
                ", clouds_hi=" + clouds_hi +
                ", precip=" + precip +
                ", low_temp=" + low_temp +
                ", max_temp=" + max_temp +
                ", moonset_ts=" + moonset_ts +
                ", datetime='" + datetime + '\'' +
                ", temp=" + temp +
                ", min_temp=" + min_temp +
                ", clouds_mid=" + clouds_mid +
                ", clouds_low=" + clouds_low
                ;
    }

    public int getMoonrise_ts() {
        return moonrise_ts;
    }

    public void setMoonrise_ts(int moonrise_ts) {
        this.moonrise_ts = moonrise_ts;
    }

    public String getWind_cdir() {
        return wind_cdir;
    }

    public void setWind_cdir(String wind_cdir) {
        this.wind_cdir = wind_cdir;
    }

    public int getRh() {
        return rh;
    }

    public void setRh(int rh) {
        this.rh = rh;
    }

    public long getPres() {
        return pres;
    }

    public void setPres(long pres) {
        this.pres = pres;
    }

    public long getHigh_temp() {
        return high_temp;
    }

    public void setHigh_temp(long high_temp) {
        this.high_temp = high_temp;
    }

    public int getSunset_ts() {
        return sunset_ts;
    }

    public void setSunset_ts(int sunset_ts) {
        this.sunset_ts = sunset_ts;
    }

    public long getOzone() {
        return ozone;
    }

    public void setOzone(long ozone) {
        this.ozone = ozone;
    }

    public long getMoon_phase() {
        return moon_phase;
    }

    public void setMoon_phase(long moon_phase) {
        this.moon_phase = moon_phase;
    }

    public long getWind_gust_spd() {
        return wind_gust_spd;
    }

    public void setWind_gust_spd(long wind_gust_spd) {
        this.wind_gust_spd = wind_gust_spd;
    }

    public int getSnow_depth() {
        return snow_depth;
    }

    public void setSnow_depth(int snow_depth) {
        this.snow_depth = snow_depth;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getSunrise_ts() {
        return sunrise_ts;
    }

    public void setSunrise_ts(int sunrise_ts) {
        this.sunrise_ts = sunrise_ts;
    }

    public long getApp_min_temp() {
        return app_min_temp;
    }

    public void setApp_min_temp(long app_min_temp) {
        this.app_min_temp = app_min_temp;
    }

    public long getWind_spd() {
        return wind_spd;
    }

    public void setWind_spd(long wind_spd) {
        this.wind_spd = wind_spd;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public String getWind_cdir_full() {
        return wind_cdir_full;
    }

    public void setWind_cdir_full(String wind_cdir_full) {
        this.wind_cdir_full = wind_cdir_full;
    }

    public long getSlp() {
        return slp;
    }

    public void setSlp(long slp) {
        this.slp = slp;
    }

    public long getMoon_phase_lunation() {
        return moon_phase_lunation;
    }

    public void setMoon_phase_lunation(long moon_phase_lunation) {
        this.moon_phase_lunation = moon_phase_lunation;
    }

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }

    public long getApp_max_temp() {
        return app_max_temp;
    }

    public void setApp_max_temp(long app_max_temp) {
        this.app_max_temp = app_max_temp;
    }

    public long getVis() {
        return vis;
    }

    public void setVis(long vis) {
        this.vis = vis;
    }

    public long getDewpt() {
        return dewpt;
    }

    public void setDewpt(long dewpt) {
        this.dewpt = dewpt;
    }

    public int getSnow() {
        return snow;
    }

    public void setSnow(int snow) {
        this.snow = snow;
    }

    public long getUv() {
        return uv;
    }

    public void setUv(long uv) {
        this.uv = uv;
    }

    public JSONObject getWeather() {
        return weather;
    }

    public void setWeather(JSONObject weather) {
        this.weather = weather;
    }

    public int getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(int wind_dir) {
        this.wind_dir = wind_dir;
    }

    public String getMax_dhi() {
        return max_dhi;
    }

    public void setMax_dhi(String max_dhi) {
        this.max_dhi = max_dhi;
    }

    public int getClouds_hi() {
        return clouds_hi;
    }

    public void setClouds_hi(int clouds_hi) {
        this.clouds_hi = clouds_hi;
    }

    public long getPrecip() {
        return precip;
    }

    public void setPrecip(long precip) {
        this.precip = precip;
    }

    public long getLow_temp() {
        return low_temp;
    }

    public void setLow_temp(long low_temp) {
        this.low_temp = low_temp;
    }

    public long getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(long max_temp) {
        this.max_temp = max_temp;
    }

    public int getMoonset_ts() {
        return moonset_ts;
    }

    public void setMoonset_ts(int moonset_ts) {
        this.moonset_ts = moonset_ts;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public long getTemp() {
        return temp;
    }

    public void setTemp(long temp) {
        this.temp = temp;
    }

    public long getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(long min_temp) {
        this.min_temp = min_temp;
    }

    public int getClouds_mid() {
        return clouds_mid;
    }

    public void setClouds_mid(int clouds_mid) {
        this.clouds_mid = clouds_mid;
    }

    public int getClouds_low() {
        return clouds_low;
    }

    public void setClouds_low(int clouds_low) {
        this.clouds_low = clouds_low;
    }
}
