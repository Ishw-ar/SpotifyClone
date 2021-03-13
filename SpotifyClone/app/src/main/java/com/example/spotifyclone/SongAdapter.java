package com.example.spotifyclone;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<SongModelClass> musicArrayList;
    private MediaPlayer mediaPlayer;
    private boolean flag=true;


    public SongAdapter(Context context, int layout, ArrayList<SongModelClass> musicArrayList) {
        this.context = context;
        this.layout = layout;
        this.musicArrayList = musicArrayList;
    }

    @Override
    public int getCount() {
        return musicArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return musicArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public class ViewHolder {
        TextView textView_songName, textView_artist;
        ImageView imageView_play, imageView_stop, imageView_images;
        private View convertview;

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        public ViewHolder() {
            convertview = layoutInflater.inflate(layout, null);
            textView_songName = convertview.findViewById(R.id.tvShanSong);
            imageView_images = convertview.findViewById(R.id.imageShan);
          //  imageView_play = convertview.findViewById(R.id.btnPlaysong);
          //  imageView_stop = convertview.findViewById(R.id.btnStopSong);

        }
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         ViewHolder viewHolder = new ViewHolder();
            if (convertView == null) {
                convertView = viewHolder.convertview;
            } else {


            }


        final SongModelClass songModelClass = musicArrayList.get(position);
        // viewHolder.textView_songName.setText(musicArrayList.get(songModelClass));
        viewHolder.textView_artist.setText(songModelClass.getSongImage());
        viewHolder.imageView_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(flag){
                 mediaPlayer =MediaPlayer.create(context,songModelClass.getSongs());
                 flag=false;
             }
             if(mediaPlayer.isPlaying()){
                 mediaPlayer.pause();
                 viewHolder.imageView_play.setImageResource(R.drawable.ic_images__2_);
             }else {
                 mediaPlayer.start();
                 viewHolder.imageView_play.setImageResource(R.drawable.ic_download__7_);
             }mediaPlayer.start();

            }
        });
        viewHolder.imageView_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    flag=true;
                }
                viewHolder.imageView_stop.setImageResource(R.drawable.ic_images__2_);

            }
        });

        return convertView;
    }
}
