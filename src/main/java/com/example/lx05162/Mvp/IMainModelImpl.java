package com.example.lx05162.Mvp;

import com.example.lx05162.Net.HttpUtil;

/*
 *@Auther:田恒宇
 *@weichat: 15020451581
 *@Description:function
 */
public class IMainModelImpl implements IMainContract.IMainModel {
    public HttpUtil util;
    public IMainModelImpl(){
        util=HttpUtil.util();
    }
    @Override
    public void doHttpUtil(String url, String t1, String t2, HttpUtil.getAs as) {
        util.getASS(url,t1,t2,as);
    }
}
