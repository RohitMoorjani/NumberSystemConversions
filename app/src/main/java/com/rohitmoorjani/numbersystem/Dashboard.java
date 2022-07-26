package com.rohitmoorjani.numbersystem;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Dashboard extends AppCompatActivity implements View.OnClickListener{
    CardView o2b,o2h,o2d,h2b,h2o,h2d,d2o,d2h,d2b,b2h,b2o,b2d;
    Context context=this;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Number System Conversion");

        o2b = findViewById(R.id.o2b);
        o2h = findViewById(R.id.o2h);
        o2d = findViewById(R.id.o2d);
        h2b = findViewById(R.id.h2b);
        h2o = findViewById(R.id.h2o);
        h2d = findViewById(R.id.h2d);
        d2o = findViewById(R.id.d2o);
        d2h = findViewById(R.id.d2h);
        d2b = findViewById(R.id.d2b);
        b2h = findViewById(R.id.b2h);
        b2o = findViewById(R.id.b2o);
        b2d = findViewById(R.id.b2d);

        h2b.setOnClickListener(this);
        h2d.setOnClickListener(this);
        h2o.setOnClickListener(this);
        o2b.setOnClickListener(this);
        o2d.setOnClickListener(this);
        o2h.setOnClickListener(this);
        b2d.setOnClickListener(this);
        b2o.setOnClickListener(this);
        b2h.setOnClickListener(this);
        d2b.setOnClickListener(this);
        d2o.setOnClickListener(this);
        d2h.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, main.class);
        switch (v.getId()){
            case R.id.o2b:
                intent.putExtra("key","o2b");
                getSupportActionBar().setTitle("Octal to Binary");
                break;
            case R.id.o2d:
                intent.putExtra("key","o2d");
                break;
            case R.id.o2h:
                intent.putExtra("key","o2h");
                break;
            case R.id.h2b:
                intent.putExtra("key","h2b");
                break;
            case R.id.h2d:
                intent.putExtra("key","h2d");
                break;
            case R.id.h2o:
                intent.putExtra("key","h2o");
                break;
            case R.id.b2d:
                intent.putExtra("key","b2d");
                break;
            case R.id.b2o:
                intent.putExtra("key","b2o");
                break;
            case R.id.b2h:
                intent.putExtra("key","b2h");
                break;
            case R.id.d2b:
                intent.putExtra("key","d2b");
                break;
            case R.id.d2h:
                intent.putExtra("key","d2h");
                break;
            case R.id.d2o:
                intent.putExtra("key","d2o");
                break;



        }
        startActivity(intent);
    }
}