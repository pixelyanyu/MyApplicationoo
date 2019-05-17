package com.example.lx05162.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/*
 *@Auther:田恒宇
 *@weichat: 15020451581
 *@Description:function
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getView());

        getById();
        getDate();
        getEvent();

    }
    public abstract int getView();

    public abstract void getById();

    public abstract void getDate();

    public abstract void getEvent();
}
