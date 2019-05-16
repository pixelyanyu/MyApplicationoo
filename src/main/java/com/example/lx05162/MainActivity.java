package com.example.lx05162;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lx05162.Mvp.IMainContract;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , IMainContract.Login {

    private EditText t1;
    private EditText t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.et1);
        t2 = findViewById(R.id.et2);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void getData(String a) {

    }

    @Override
    public void getTat(String a) {

    }
}
