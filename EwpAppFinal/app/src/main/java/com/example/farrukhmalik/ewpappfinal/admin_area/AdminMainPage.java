package com.example.farrukhmalik.ewpappfinal.admin_area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.farrukhmalik.ewpappfinal.R;

public class AdminMainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main_page);



        startActivity(new Intent(AdminMainPage.this, PostOrRead.class));
    }
}
