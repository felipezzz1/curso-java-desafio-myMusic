package br.com.fezor.myMusics.models;

public class Audio {
    private String title;
    private int playCount;
    private int likeCount;
    private double rating;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getPlayCount() {
        return playCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public double getRating() {
        return rating;
    }

    public void like(){
        this.likeCount++;
    }

    public void play(){
        this.playCount++;
    }


}
