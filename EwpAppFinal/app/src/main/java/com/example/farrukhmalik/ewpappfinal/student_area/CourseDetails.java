package com.example.farrukhmalik.ewpappfinal.student_area;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.farrukhmalik.ewpappfinal.R;
import com.example.farrukhmalik.ewpappfinal.fragment_adapter.SCourseFregmantAdapter;

public class CourseDetails extends AppCompatActivity {

    SCourseFregmantAdapter cstm;
    ViewPager vp;
    TabLayout tl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        cstm = new SCourseFregmantAdapter(getSupportFragmentManager());


        vp = (ViewPager) findViewById(R.id.vp);
        tl = (TabLayout) findViewById(R.id.tl);


        vp.setAdapter(cstm);
        tl.setupWithViewPager(vp);


    }
}
