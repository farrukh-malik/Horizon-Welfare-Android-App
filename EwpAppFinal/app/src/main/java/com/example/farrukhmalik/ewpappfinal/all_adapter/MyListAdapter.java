package com.example.farrukhmalik.ewpappfinal.all_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.farrukhmalik.ewpappfinal.R;
import com.example.farrukhmalik.ewpappfinal.my_custom_classes.MyPostClass;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by Farrukh Malik on 3/15/2017.
 */
public class MyListAdapter extends BaseAdapter {


    Button removeBtn;
    String getReference = "PostNewThings";
    ArrayList<MyPostClass> arrayList;
    LayoutInflater inflater;

    TextView post;

    Context context;
    public MyListAdapter(ArrayList<MyPostClass> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        convertView = inflater.from(context).inflate(R.layout.read_post_of_admin,parent,false);

        post = (TextView) convertView.findViewById(R.id.readPostListId);

        post.setText(arrayList.get(position).getPostText());

        removeBtn = (Button) convertView.findViewById(R.id.postRemoveBtnId);
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        return convertView;
    }
}
