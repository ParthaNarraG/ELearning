package com.example.elearning;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ToggleButton;

import com.example.elearning.Adapters.courseAdapter;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    androidx.appcompat.widget.Toolbar toolbar;
    courseAdapter adapter;


    ArrayList<String> mCoverPrice = new ArrayList<>();
    ArrayList<String> mCoverTitle = new ArrayList<>();
    ArrayList<Integer> mCourseCover = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_gallery);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Home");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        navigationView = (NavigationView) findViewById(R.id.nv_home);
        drawerLayout = (DrawerLayout) findViewById(R.id.dl_home);
        navigationView = (NavigationView) findViewById(R.id.nv_home);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);  //For open and closing Navigation
        drawerLayout.addDrawerListener(toggle);  //Adding toggle button for drawer listener
        toggle.syncState();   //Toggle icon will sync to drawer listener
        navigationView.setNavigationItemSelectedListener(this);
        data();
        recycler();
    }

    private void recycler() {
        RecyclerView recyclerView = findViewById(R.id.rv_nested);
        adapter = new courseAdapter(this, mCoverPrice, mCoverTitle, mCourseCover);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void data() {
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
        mCourseCover.add(R.mipmap.learn);
        mCoverTitle.add("Course on Android Development");
        mCoverPrice.add("400.00");
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();
        if(id==R.id.menu_wishList){
            Intent intent=new Intent(HomeActivity.this,Wishlist.class);
            startActivity(intent);
        }
        if(id==R.id.menu_courses){
            Intent intent=new Intent(HomeActivity.this,CoursesActivity.class);
            startActivity(intent);
        }
        drawerLayout.closeDrawer(GravityCompat.START);   //Close the drawer layout
        return true;
    }
}
