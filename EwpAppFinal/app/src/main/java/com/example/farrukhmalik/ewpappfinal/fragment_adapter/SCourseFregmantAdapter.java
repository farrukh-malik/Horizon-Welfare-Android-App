package com.example.farrukhmalik.ewpappfinal.fragment_adapter;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.farrukhmalik.ewpappfinal.student_area.HyderabadCourse;
import com.example.farrukhmalik.ewpappfinal.student_area.KarachiCourse;

/**
 * Created by Farrukh Malik on 3/15/2017.
 */
public class SCourseFregmantAdapter extends FragmentPagerAdapter {

    public SCourseFregmantAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {


        switch (position){

            case 0:
                return new KarachiCourse();
            case 1:
                return new HyderabadCourse();

            default:
                return null;

        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0:
                return "Karachi";
            case 1:
                return "Hyderabad";

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
