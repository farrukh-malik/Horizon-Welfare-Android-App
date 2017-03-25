package com.example.farrukhmalik.ewpappfinal.student_area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.farrukhmalik.ewpappfinal.R;

public class StudentMainPage extends AppCompatActivity {

    ImageButton courseBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main_page);


        courseBtn = (ImageButton) findViewById(R.id.viewAllVacancyCourseDetailId);
        courseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(StudentMainPage.this, CourseDetails.class));
            }
        });

    }
}
