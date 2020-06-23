package com.example.elearning.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elearning.R;

import java.util.ArrayList;

public class coursesAdapter  extends  RecyclerView.Adapter<coursesAdapter.ViewHolder>{

    ArrayList<Integer> mCoursePhoto=new ArrayList<>();
    ArrayList<String> mCourseTitle=new ArrayList<>();
    ArrayList<String> mCourseInstructor=new ArrayList<>();
    Context mContext;

    public coursesAdapter(ArrayList<Integer> mCoursePhoto, ArrayList<String> mCourseTitle,  ArrayList<String> mCourseInstructor, Context mContext) {
        this.mCoursePhoto = mCoursePhoto;
        this.mCourseTitle = mCourseTitle;
        this.mCourseInstructor = mCourseInstructor;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_courses_adapter,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.courseInstructor.setText(mCourseInstructor.get(position));
        holder.courseName.setText(mCourseTitle.get(position));
        holder.courseCover.setImageResource(mCoursePhoto.get(position));
    }

    @Override
    public int getItemCount() {
        return mCourseTitle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView courseCover;
        TextView startCourse,courseInstructor,courseName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            courseCover=itemView.findViewById(R.id.iv_coursePhoto);
            startCourse=itemView.findViewById(R.id.tv_startCourse);
            courseInstructor=itemView.findViewById(R.id.tv_courseInstructor);
            courseName=itemView.findViewById(R.id.tv_courseTitle);

        }
    }
}
