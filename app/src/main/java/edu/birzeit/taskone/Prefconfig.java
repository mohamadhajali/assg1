package edu.birzeit.taskone;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Prefconfig
{
    private static final String LIST_KEY = "list_key";
    public static void wraitlistInPref(Context context, ArrayList<jym> list){
        Gson gson = new Gson();
        String gsonString = gson.toJson(list);
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(LIST_KEY,gsonString);
        editor.apply();
    }

    public static  ArrayList<jym> readlistFronpref(Context context){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        String jsonstring = pref.getString(LIST_KEY,"");
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<jym>>(){}.getType();
        ArrayList<jym> list = gson.fromJson(jsonstring,type);
        return list;
    }
}
