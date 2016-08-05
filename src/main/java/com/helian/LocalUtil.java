package com.helian;

import java.util.Locale;

public class LocalUtil {
    private static ThreadLocal<Locale> userLocale = new ThreadLocal<Locale>();

    public static void setLocale(Locale locale) {
        userLocale.set(locale);
    }

    public static void cleanLocale() {
        userLocale.remove();
    }

    public static Locale getLocale() {
        return userLocale.get();
    }
}