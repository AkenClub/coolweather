package com.hong.coolweather.gson;

import java.util.List;

public class WeatherBean {

    /**
     * basic : {"cid":"CN101281002","location":"吴川","parent_city":"湛江","admin_area":"广东","cnty":"中国","lat":"21.42845345","lon":"110.78050995","tz":"+8.00"}
     * update : {"loc":"2019-08-03 15:12","utc":"2019-08-03 07:12"}
     * status : ok
     * now : {"cloud":"97","cond_code":"104","cond_txt":"阴","fl":"30","hum":"90","pcpn":"0.0","pres":"996","tmp":"29","vis":"16","wind_deg":"277","wind_dir":"西风","wind_sc":"4","wind_spd":"28"}
     * daily_forecast : [{"cond_code_d":"300","cond_code_n":"300","cond_txt_d":"阵雨","cond_txt_n":"阵雨","date":"2019-08-03","hum":"90","mr":"08:11","ms":"21:16","pcpn":"7.0","pop":"70","pres":"999","sr":"06:11","ss":"19:14","tmp_max":"30","tmp_min":"25","uv_index":"1","vis":"24","wind_deg":"97","wind_dir":"东风","wind_sc":"3-4","wind_spd":"24"},{"cond_code_d":"306","cond_code_n":"300","cond_txt_d":"中雨","cond_txt_n":"阵雨","date":"2019-08-04","hum":"88","mr":"09:16","ms":"22:00","pcpn":"0.0","pop":"25","pres":"999","sr":"06:11","ss":"19:13","tmp_max":"30","tmp_min":"25","uv_index":"1","vis":"24","wind_deg":"-1","wind_dir":"无持续风向","wind_sc":"1-2","wind_spd":"2"},{"cond_code_d":"300","cond_code_n":"300","cond_txt_d":"阵雨","cond_txt_n":"阵雨","date":"2019-08-05","hum":"91","mr":"10:18","ms":"22:43","pcpn":"1.3","pop":"54","pres":"1000","sr":"06:11","ss":"19:13","tmp_max":"31","tmp_min":"26","uv_index":"1","vis":"21","wind_deg":"-1","wind_dir":"无持续风向","wind_sc":"1-2","wind_spd":"4"}]
     * lifestyle : [{"type":"comf","brf":"较舒适","txt":"白天有雨，从而使空气湿度加大，会使人们感觉有点儿闷热，但早晚的天气很凉爽、舒适。"},{"type":"drsg","brf":"热","txt":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"},{"type":"flu","brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},{"type":"sport","brf":"较不宜","txt":"有降水，且风力较强，推荐您在室内进行低强度运动；若坚持户外运动，请选择避雨防风的地点。"},{"type":"trav","brf":"适宜","txt":"有降水，温度适宜，风稍大，在细雨中游玩也别有一番情调，但记得出门要携带雨具。"},{"type":"uv","brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"type":"cw","brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"type":"air","brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}]
     */

    private BasicBean basic;
    private UpdateBean update;
    private String status;
    private NowBean now;
    private List<DailyForecastBean> daily_forecast;
    private List<LifestyleBean> lifestyle;

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public UpdateBean getUpdate() {
        return update;
    }

    public void setUpdate(UpdateBean update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public List<DailyForecastBean> getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
        this.daily_forecast = daily_forecast;
    }

    public List<LifestyleBean> getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(List<LifestyleBean> lifestyle) {
        this.lifestyle = lifestyle;
    }

    public static class BasicBean {
        /**
         * cid : CN101281002
         * location : 吴川
         * parent_city : 湛江
         * admin_area : 广东
         * cnty : 中国
         * lat : 21.42845345
         * lon : 110.78050995
         * tz : +8.00
         */

        private String cid;
        private String location;
        private String parent_city;
        private String admin_area;
        private String cnty;
        private String lat;
        private String lon;
        private String tz;

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getParent_city() {
            return parent_city;
        }

        public void setParent_city(String parent_city) {
            this.parent_city = parent_city;
        }

        public String getAdmin_area() {
            return admin_area;
        }

        public void setAdmin_area(String admin_area) {
            this.admin_area = admin_area;
        }

        public String getCnty() {
            return cnty;
        }

        public void setCnty(String cnty) {
            this.cnty = cnty;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getTz() {
            return tz;
        }

        public void setTz(String tz) {
            this.tz = tz;
        }
    }

    public static class UpdateBean {
        /**
         * loc : 2019-08-03 15:12
         * utc : 2019-08-03 07:12
         */

        private String loc;
        private String utc;

        public String getLoc() {
            return loc;
        }

        public void setLoc(String loc) {
            this.loc = loc;
        }

        public String getUtc() {
            return utc;
        }

        public void setUtc(String utc) {
            this.utc = utc;
        }
    }

    public static class NowBean {
        /**
         * cloud : 97
         * cond_code : 104
         * cond_txt : 阴
         * fl : 30
         * hum : 90
         * pcpn : 0.0
         * pres : 996
         * tmp : 29
         * vis : 16
         * wind_deg : 277
         * wind_dir : 西风
         * wind_sc : 4
         * wind_spd : 28
         */

        private String cloud;
        private String cond_code;
        private String cond_txt;
        private String fl;
        private String hum;
        private String pcpn;
        private String pres;
        private String tmp;
        private String vis;
        private String wind_deg;
        private String wind_dir;
        private String wind_sc;
        private String wind_spd;

        public String getCloud() {
            return cloud;
        }

        public void setCloud(String cloud) {
            this.cloud = cloud;
        }

        public String getCond_code() {
            return cond_code;
        }

        public void setCond_code(String cond_code) {
            this.cond_code = cond_code;
        }

        public String getCond_txt() {
            return cond_txt;
        }

        public void setCond_txt(String cond_txt) {
            this.cond_txt = cond_txt;
        }

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public String getTmp() {
            return tmp;
        }

        public void setTmp(String tmp) {
            this.tmp = tmp;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public String getWind_deg() {
            return wind_deg;
        }

        public void setWind_deg(String wind_deg) {
            this.wind_deg = wind_deg;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public String getWind_sc() {
            return wind_sc;
        }

        public void setWind_sc(String wind_sc) {
            this.wind_sc = wind_sc;
        }

        public String getWind_spd() {
            return wind_spd;
        }

        public void setWind_spd(String wind_spd) {
            this.wind_spd = wind_spd;
        }
    }

    public static class DailyForecastBean {
        /**
         * cond_code_d : 300
         * cond_code_n : 300
         * cond_txt_d : 阵雨
         * cond_txt_n : 阵雨
         * date : 2019-08-03
         * hum : 90
         * mr : 08:11
         * ms : 21:16
         * pcpn : 7.0
         * pop : 70
         * pres : 999
         * sr : 06:11
         * ss : 19:14
         * tmp_max : 30
         * tmp_min : 25
         * uv_index : 1
         * vis : 24
         * wind_deg : 97
         * wind_dir : 东风
         * wind_sc : 3-4
         * wind_spd : 24
         */

        private String cond_code_d;
        private String cond_code_n;
        private String cond_txt_d;
        private String cond_txt_n;
        private String date;
        private String hum;
        private String mr;
        private String ms;
        private String pcpn;
        private String pop;
        private String pres;
        private String sr;
        private String ss;
        private String tmp_max;
        private String tmp_min;
        private String uv_index;
        private String vis;
        private String wind_deg;
        private String wind_dir;
        private String wind_sc;
        private String wind_spd;

        public String getCond_code_d() {
            return cond_code_d;
        }

        public void setCond_code_d(String cond_code_d) {
            this.cond_code_d = cond_code_d;
        }

        public String getCond_code_n() {
            return cond_code_n;
        }

        public void setCond_code_n(String cond_code_n) {
            this.cond_code_n = cond_code_n;
        }

        public String getCond_txt_d() {
            return cond_txt_d;
        }

        public void setCond_txt_d(String cond_txt_d) {
            this.cond_txt_d = cond_txt_d;
        }

        public String getCond_txt_n() {
            return cond_txt_n;
        }

        public void setCond_txt_n(String cond_txt_n) {
            this.cond_txt_n = cond_txt_n;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getMr() {
            return mr;
        }

        public void setMr(String mr) {
            this.mr = mr;
        }

        public String getMs() {
            return ms;
        }

        public void setMs(String ms) {
            this.ms = ms;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPop() {
            return pop;
        }

        public void setPop(String pop) {
            this.pop = pop;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public String getSr() {
            return sr;
        }

        public void setSr(String sr) {
            this.sr = sr;
        }

        public String getSs() {
            return ss;
        }

        public void setSs(String ss) {
            this.ss = ss;
        }

        public String getTmp_max() {
            return tmp_max;
        }

        public void setTmp_max(String tmp_max) {
            this.tmp_max = tmp_max;
        }

        public String getTmp_min() {
            return tmp_min;
        }

        public void setTmp_min(String tmp_min) {
            this.tmp_min = tmp_min;
        }

        public String getUv_index() {
            return uv_index;
        }

        public void setUv_index(String uv_index) {
            this.uv_index = uv_index;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public String getWind_deg() {
            return wind_deg;
        }

        public void setWind_deg(String wind_deg) {
            this.wind_deg = wind_deg;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public String getWind_sc() {
            return wind_sc;
        }

        public void setWind_sc(String wind_sc) {
            this.wind_sc = wind_sc;
        }

        public String getWind_spd() {
            return wind_spd;
        }

        public void setWind_spd(String wind_spd) {
            this.wind_spd = wind_spd;
        }
    }

    public static class LifestyleBean {
        /**
         * type : comf
         * brf : 较舒适
         * txt : 白天有雨，从而使空气湿度加大，会使人们感觉有点儿闷热，但早晚的天气很凉爽、舒适。
         */

        private String type;
        private String brf;
        private String txt;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBrf() {
            return brf;
        }

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }
}
