package com.blog.common;

import java.util.Calendar;
import java.util.Date;

public class CommonHelper {

    public static Date getCurrentDate()
    {
        return Calendar.getInstance().getTime();
    }

    public static Boolean isNullOrEmpty(String str)
    {
        return str==null||str.isEmpty();
    }

}
