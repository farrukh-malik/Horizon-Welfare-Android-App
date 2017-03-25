package com.example.farrukhmalik.ewpappfinal.admin_area;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.farrukhmalik.ewpappfinal.R;
import com.example.farrukhmalik.ewpappfinal.all_adapter.MyListAdapter;
import com.example.farrukhmalik.ewpappfinal.my_custom_classes.MyPostClass;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class PostOrRead extends AppCompatActivity {

    ListView listView;

    MyPostClass myPostClass;
    MyListAdapter listAdapter;
    ArrayList<MyPostClass> arrayList;

    //////////
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    ///////////
    Button postBtn;

    FirebaseDatabase db;
    DatabaseReference ref;


    EditText etPostNewThings;

    String stringKeyPost, stringUid, stringPostNewThings;

    ArrayList<MyPostClass> myPostClassArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_or_read);



        db = FirebaseDatabase.getInstance();
        ref = db.getReference("PostNewThings");


        /////////
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();

        if (firebaseAuth.getCurrentUser() == null){

            // startActivity(new Intent(this, Login.class));
        }else {
            stringUid = firebaseUser.getUid();//
        }

        ///////////
        listView = (ListView) findViewById(R.id.listOfAdminPostId);

        myPostClassArrayList = new ArrayList<>();
        arrayList = new ArrayList<>();

        listAdapter = new MyListAdapter(arrayList,this);
//
        listView.setAdapter(listAdapter);
//




        etPostNewThings = (EditText) findViewById(R.id.etForPostId);


//////////post push/////////
        postBtn = (Button) findViewById(R.id.postBtnId);
        postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                stringPostNewThings = etPostNewThings.getText().toString().trim();


                myPostClass = new MyPostClass(ref.push().getKey().toString(), stringPostNewThings);
                ref.child(myPostClass.getKey()).setValue(myPostClass);


                etPostNewThings.setText("");

            }
        });

//////////////////////////////



        FirebaseDatabase.getInstance().getReference().child("PostNewThings").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {


                myPostClass = dataSnapshot.getValue(MyPostClass.class);

              //  Log.d("data", "onChildAdded: "+postRecord.getName());

                arrayList.add(myPostClass);

                listAdapter.notifyDataSetChanged();


            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
