package com.example.spotifyclone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChildRecyclerViewAdapter extends RecyclerView.Adapter<ChildRecyclerViewAdapter.MyViewHolder> {
    public ArrayList<ChildModel> childModelArrayList;

    Context cxt;
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView song_image;
        public TextView songName;
        private ItemClickListener itemClickListener;
        //ChildModel childModel =new ChildModel(song_image);



        public MyViewHolder(View itemView) {
            super(itemView);
            this.itemClickListener=itemClickListener;
            song_image = itemView.findViewById(R.id.song_image);
            songName = itemView.findViewById(R.id.Song_name);
          //  song_image.setImageResource();

        }

      //  @Override
        //public void onClick(View v) {
          //  itemClickListener.onItemClicked(songImage);



        }
   // }
    public ChildRecyclerViewAdapter(ArrayList<ChildModel> arrayList, Context mContext) {
        this.cxt = mContext;
        this.childModelArrayList = arrayList;

    }


    @NonNull
    @Override
    public ChildRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_recyclerview_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildRecyclerViewAdapter.MyViewHolder holder, int position) {
        ChildModel currentItem = childModelArrayList.get(position);
        holder.song_image.setImageResource(currentItem.getSong_image());
        holder.songName.setText(currentItem.getSongName());
    }

    @Override
    public int getItemCount() {
        return childModelArrayList.size();
    }
}
