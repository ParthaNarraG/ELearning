package com.example.elearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.elearning.Adapters.WishlistAdapter;
import com.example.elearning.Adapters.coursesAdapter;

import java.util.ArrayList;

public class CoursesActivity extends AppCompatActivity {

    coursesAdapter adapter;
    ArrayList<Integer> mCoursePhoto = new ArrayList<>();
    ArrayList<String> mCourseTitle = new ArrayList<>();
    ArrayList<String> mCourseInstructor = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        data();
        recycler();
    }

    private void data() {

        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);


        mCourseInstructor.add("Course on Android Development");
        mCourseTitle.add("Course on Android Development");
        mCoursePhoto.add(R.mipmap.ic_launcher);

    }

    private void recycler() {
        RecyclerView recyclerView = findViewById(R.id.rv_coursesAct);
        adapter=new coursesAdapter(mCoursePhoto,mCourseTitle,mCourseInstructor,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
    }
}
