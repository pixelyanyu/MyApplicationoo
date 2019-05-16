package com.example.lx05162;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/*
 *@Auther:田恒宇
 *@weichat: 15020451581
 *@Description:function
 */
public class MyAppliction extends Application {

    public static RequestQueue queue;

    @Override
    public void onCreate() {
        super.onCreate();
        queue = Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue getQueue() {
        return queue;
    }
}
