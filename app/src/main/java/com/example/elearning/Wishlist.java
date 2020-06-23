package com.example.elearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.elearning.Adapters.WishlistAdapter;

import java.util.ArrayList;

public class Wishlist extends AppCompatActivity {

    WishlistAdapter adapter;
    ArrayList<Integer> mCoursePhoto = new ArrayList<>();
    ArrayList<String> mCourseTitle = new ArrayList<>();
    ArrayList<String> mCourseFee = new ArrayList<>();
    ArrayList<String> mCourseInstructor = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recycler();
        data();
    }

    private void data() {
        mCourseFee.add("300");
        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);
        mCourseFee.add("300");
        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseFee.add("300");
        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseFee.add("300");
        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseFee.add("300");
        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseFee.add("300");
        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseFee.add("300");
        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

    }

    private void recycler() {
        RecyclerView recyclerView = findViewById(R.id.rv_nested);
        adapter = new WishlistAdapter(mCoursePhoto, mCourseTitle, mCourseFee, mCourseInstructor, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
    }
}
