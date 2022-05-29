package com.example.referat2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements OnClickListener{

    TextView caloriesPage;
    TextView trainPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        caloriesPage = (TextView) findViewById(R.id.caloriesPage);
        caloriesPage.setOnClickListener((View.OnClickListener) this);
        trainPage = (TextView) findViewById(R.id.trainPage);
        trainPage.setOnClickListener((View.OnClickListener) this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.caloriesPage:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.trainPage:
                Intent intent1 = new Intent(this, MainActivity2.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}