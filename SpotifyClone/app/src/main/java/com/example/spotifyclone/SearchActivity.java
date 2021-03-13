package com.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SearchActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void play(View v){
        if(mediaPlayer==null){
            mediaPlayer=MediaPlayer.create(this,R.raw.pehli_nazar_me);
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
}