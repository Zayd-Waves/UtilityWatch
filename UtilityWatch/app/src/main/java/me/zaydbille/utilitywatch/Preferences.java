package me.zaydbille.utilitywatch;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Preferences {
    private static String STRING_PREF = "string_prefs";
    private static String INT_PREF = "int_prefs";
    private static SharedPreferences.Editor editor;

    private static SharedPreferences getPrefs(Context context) {
        return context.getSharedPreferences("myprefs", 0);
    }

    public static String getStringPref(Context context) {
        return getPrefs(context).getString(STRING_PREF, "default");
    }

    public static int getIntPref(Context context) {
        return getPrefs(context).getInt(INT_PREF, 0);
    }

    public static void setStringPref(Context context, String value) {
        getPrefs(context).edit().putString(STRING_PREF, value).apply();
    }

    public static void setIntPref(Context context, int value) {
        getPrefs(context).edit().putInt(INT_PREF, value).apply();
    }

    public static void saveList(Context context, ArrayList<String> list)
    {
        Preferences.editor = getPrefs(context).edit();
        Set<String> set = new HashSet<String>();
        set.addAll(list);
        editor.putStringSet("key", set);
        editor.apply();
    }

    public static ArrayList<String> getList(Context context) {
        ArrayList<String> list;

        //Retrieve the values
        SharedPreferences myPrefs = context.getSharedPreferences("myprefs", 0);
        Set<String> set = myPrefs.getStringSet("key", new HashSet<String>());

        list = new ArrayList<String>(set);

        return list;
    }
}
