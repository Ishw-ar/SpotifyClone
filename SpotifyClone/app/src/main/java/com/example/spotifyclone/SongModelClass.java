package com.example.spotifyclone;

public class SongModelClass {

    private String songImage;
    private String songName;
    private int songs;

    public SongModelClass(String songImage,String songName,int songs) {
        this.songImage = songImage;
        this.songName=songName;
        this.songs=songs;
    }

    public String getSongImage() {
        return songImage;
    }

    public String getSongName() {
        return songName;
    }

    public int getSongs() {
        return songs;
    }
}
