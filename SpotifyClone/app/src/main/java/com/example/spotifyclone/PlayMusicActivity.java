package com.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayMusicActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        initViews();


    }

    private void initViews() {

    }
    public void play(View v){
        if(mediaPlayer==null){
            mediaPlayer=MediaPlayer.create(this,R.raw.dil_kare);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stoplayer();
                }
            });
        }
        mediaPlayer.start();


    }
    public void stop(View v){
        stoplayer();


    }
    private void stoplayer(){
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;

        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stoplayer();
    }

//    public void play(View v){
//        if(mediaPlayer==null){
//            mediaPlayer=MediaPlayer.create(this,R.raw.dil_kare);
//            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mp) {
//                    stoplayer();
//                }
//            });
//        }
//        mediaPlayer.start();
//
//
//    }
//    public void stopsong(View v){
//        stoplayer();
//
//
//    }
//    private void stoplayer(){
//        if(mediaPlayer!=null){
//            mediaPlayer.release();
//            mediaPlayer=null;
//
//        }
//    }
//
//    @Override
//    protected void onStopstop() {
//        super.onStopstop();
//        stoplayer();
//    }
}