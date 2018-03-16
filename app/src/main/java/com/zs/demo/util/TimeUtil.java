package com.zs.demo.util;

/**
 * Created by zs
 * Date：2018年 03月 16日
 * Time：16:10
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */

public class TimeUtil {

    /**
     * 将秒数转为时分秒
     * @param time
     * @return
     */
    public static String changeTime(int time) {
        int h = 0;
        int d = 0;
        int s = 0;
        int temp = time % 3600;
        if (time > 3600) {
            h = time / 3600;
            if (temp != 0) {
                if (temp > 60) {
                    d = temp / 60;
                    if (temp % 60 != 0) {
                        s = temp % 60;
                    }
                } else {
                    s = temp;
                }
            }
        } else {
            d = time / 60;
            if (time % 60 != 0) {
                s = time % 60;
            }
        }

        return h + ":" + d + ":" + s + "";
    }

    /**
     * 将秒数转为分秒
     * @param data
     * @return
     */
    public static String timeFormat(String data) {

        int time = 0;
        try {
            time = Integer.valueOf(data);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (time == 0){
            return "0";
        }
        int d = time / 60;
        int s = 0;
        if (time % 60 != 0) {
            s = time % 60;
        }
        return  String.format("%02d", d) + "\'" + String.format("%02d", s) + "\"";
    }
    
}
