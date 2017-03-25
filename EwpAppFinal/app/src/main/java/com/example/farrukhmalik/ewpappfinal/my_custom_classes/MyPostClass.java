package com.example.farrukhmalik.ewpappfinal.my_custom_classes;

/**
 * Created by Farrukh Malik on 3/13/2017.
 */
public class MyPostClass {

    String key, uid, postText;


    public MyPostClass(String key,  String postText) {
        this.key = key;
        this.postText = postText;


    }


    public MyPostClass() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}
