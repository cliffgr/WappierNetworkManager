package com.wappier.waplib;

import android.content.Context;

/**
 * Created by Ahmed Adel on 19/06/2017.
 * <p>
 * SimpleNetworkUtils for Simple Network Library.
 */

public class SimpleNetworkUtils {

    public static boolean isNetworkAvailable(Context context) {
        return true;
    }

    public static String getCacheKey(String url) {
        if (url == null) {
            throw new RuntimeException("Null url passed in");
        } else {
            return url.replaceAll("[.:/,%?&=]", "+").replaceAll("[+]+", "+");
        }
    }

    public static boolean stringIsNotEmpty(String string) {
        if (string != null && !string.equals("null")) {
            if (!string.trim().equals("")) {
                return true;
            }
        }
        return false;
    }
}
