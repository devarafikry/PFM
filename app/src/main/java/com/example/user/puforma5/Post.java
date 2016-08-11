package com.example.user.puforma5;

/**
 * Created by user on 07/08/2016.
 */
public class Post {
    private String title;
    private int desc;
    private int thumbnail;

    public Post() {
    }

    public Post(String title, int desc, int thumbnail) {
        this.title = title;
        this.desc = desc;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public int getNumOfSongs() {
        return desc;
    }

    public void setNumOfSongs(int desc) {
        this.desc = desc;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
