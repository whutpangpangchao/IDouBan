package com.example.idouban.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


/**
 * The father of all activities in IDouban App
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVariables();
        initViews(savedInstanceState);
    }

    protected abstract void initVariables();

    protected abstract void initViews(Bundle savedInstanceState);
}
