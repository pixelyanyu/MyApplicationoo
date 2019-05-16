package com.example.lx05162.Mvp;

import com.example.lx05162.Net.HttpUtil;

/*
 *@Auther:田恒宇
 *@weichat: 15020451581
 *@Description:function
 */
public class IMainPresenterImpl implements IMainContract.IMainPresenter {
    private IMainContract.Login login;
    private IMainContract.IMainModel Model;
    @Override
    public void attach(IMainContract.Login login) {
        this.login=login;
        Model= new IMainModelImpl();
    }

    @Override
    public void detach() {
        if (Model!=null) {
            Model=null;
        }
        if (login!=null) {
            login=null;
        }
    }

    @Override
    public void login(String url, String t1, String t2) {
        Model.doHttpUtil(url, t1, t2, new HttpUtil.getAs() {
            @Override
            public void ontrue(String s) {
                login.getData(s);
            }

            @Override
            public void onfalse(String s) {

            }
        });
    }

    @Override
    public void resign(String url, String t1, String t2) {
        Model.doHttpUtil(url, t1, t2, new HttpUtil.getAs() {
            @Override
            public void ontrue(String s) {
                login.getTat(s);
            }

            @Override
            public void onfalse(String s) {

            }
        });
    }
}
