package com.example.lx05162;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lx05162.Base.BaseActivity;
import com.example.lx05162.Mvp.IMainContract;
import com.example.lx05162.Mvp.IMainPresenterImpl;

public class MainActivity extends BaseActivity implements View.OnClickListener , IMainContract.Login {

    private EditText t1;
    private EditText t2;
    private IMainContract.IMainPresenter presenter;

    @Override
    public int getView() {
        return R.layout.activity_main;
    }

    @Override
    public void getById() {
        t1 = findViewById(R.id.et1);
        t2 = findViewById(R.id.et2);
        findViewById(R.id.bt1).setOnClickListener(this);
        findViewById(R.id.bt2).setOnClickListener(this);
        presenter=new IMainPresenterImpl();
        presenter.attach(this);
    }

    @Override
    public void getDate() {

    }

    @Override
    public void getEvent() {

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bt1) {
            String user = t1.getText().toString().trim();
            String pass = t2.getText().toString().trim();
            presenter.login("http://172.17.8.100/small/user/v1/login",user,pass);
        } else if (v.getId()==R.id.bt2) {
            String user = t1.getText().toString().trim();
            String pass = t2.getText().toString().trim();
            presenter.resign("http://172.17.8.100/small/user/v1/register",user,pass);
        }
    }
    @Override
    public void getData(String a) {
        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getTat(String a) {
        Toast.makeText(this, a+"", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detach();
    }


}
