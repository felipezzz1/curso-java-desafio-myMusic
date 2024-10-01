package br.com.fezor.myMusics.models;

public class Music extends Audio{
    private String album;
    private String singer;

    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double getRating() {
        if(this.getPlayCount() > 2000){
            return 10;
        }else{
            return 7;
        }
    }
}
