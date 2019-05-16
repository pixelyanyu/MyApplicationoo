package com.example.lx05162.Mvp;

import com.example.lx05162.Net.HttpUtil;

/*
 *@Auther:田恒宇
 *@weichat: 15020451581
 *@Description:function
 */
public interface IMainContract {
    interface Login{
        void getData(String a);
        void getTat(String a);
    }
    interface IMainModel{
        void doHttpUtil(String url, String t1, String t2, HttpUtil.getAs as);
    }
    interface IMainPresenter{
        void attach(Login login);
        void detach();
        void login(String url,String t1,String t2);
        void resign(String url,String t1,String t2);
    }
}
