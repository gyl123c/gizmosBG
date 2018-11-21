package com.gyl.bg.gizmos.util;

public class StringUtil {

    public static Boolean isEmpty(String s) {
        if (s == null || "".equals(s.trim())) {
            return true;
        }
        return false;
    }

}
