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

public class courseAdapter extends RecyclerView.Adapter<courseAdapter.ViewHolder>{

    Context context;
    ArrayList<String> mCoverPrice=new ArrayList<>();
    ArrayList<String> mCoverTitle=new ArrayList<>();
    ArrayList<Integer> mCourseCover=new ArrayList<>();

    public courseAdapter(Context context, ArrayList<String> mCoverPrice, ArrayList<String> mCoverTitle, ArrayList<Integer> mCourseCover) {
        this.context = context;
        this.mCoverPrice = mCoverPrice;
        this.mCoverTitle = mCoverTitle;
        this.mCourseCover = mCourseCover;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_current_courses,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.coverPrice.setText(mCoverPrice.get(position));
        holder.coverTitle.setText(mCoverTitle.get(position));
        holder.coverPhoto.setImageResource(mCourseCover.get(position));
    }

    @Override
    public int getItemCount() {
        return mCourseCover.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView coverPhoto;
        TextView coverTitle,coverPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            coverPhoto=itemView.findViewById(R.id.iv_courseCover);
            coverTitle=itemView.findViewById(R.id.tv_courseTitle);
            coverPrice=itemView.findViewById(R.id.tv_price);
        }
    }
}
