package br.com.fezor.myMusics.main;

import br.com.fezor.myMusics.models.FavoriteSongs;
import br.com.fezor.myMusics.models.Music;
import br.com.fezor.myMusics.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("It's my life");
        myMusic.setSinger("Bon Jovi");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();

        myPodcast.setTitle("Podcast production");
        myPodcast.setPresenter("Production");

        for (int i = 0; i < 1500; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        FavoriteSongs favorite = new FavoriteSongs();

        favorite.include(myMusic);
        favorite.include(myPodcast);
    }
}