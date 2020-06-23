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

public class WishlistAdapter  extends  RecyclerView.Adapter<WishlistAdapter.ViewHolder>{

    ArrayList<Integer> mCoursePhoto=new ArrayList<>();
    ArrayList<String> mCourseTitle=new ArrayList<>();
    ArrayList<String> mCourseFee=new ArrayList<>();
    ArrayList<String> mCourseInstructor=new ArrayList<>();
    Context mContext;

    public WishlistAdapter(ArrayList<Integer> mCoursePhoto, ArrayList<String> mCourseTitle, ArrayList<String> mCourseFee, ArrayList<String> mCourseInstructor, Context mContext) {
        this.mCoursePhoto = mCoursePhoto;
        this.mCourseTitle = mCourseTitle;
        this.mCourseFee = mCourseFee;
        this.mCourseInstructor = mCourseInstructor;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_wishlist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.courseFee.setText(mCourseFee.get(position));
        holder.courseInstructor.setText(mCourseInstructor.get(position));
        holder.courseName.setText(mCourseTitle.get(position));
        holder.courseCover.setImageResource(mCoursePhoto.get(position));
    }

    @Override
    public int getItemCount() {
        return mCourseFee.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView courseCover;
        TextView courseFee,courseInstructor,courseName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            courseCover=itemView.findViewById(R.id.iv_coursePhoto);
            courseFee=itemView.findViewById(R.id.tv_courseFee);
            courseInstructor=itemView.findViewById(R.id.tv_courseInstructor);
            courseName=itemView.findViewById(R.id.tv_courseTitle);

        }
    }
}
