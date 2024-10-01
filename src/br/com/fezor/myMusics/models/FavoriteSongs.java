package br.com.fezor.myMusics.models;

public class FavoriteSongs {
    public void include(Audio audio){
        if(audio.getRating() >= 8){
            System.out.println(audio.getTitle() + " it's a amazing and listened by a lot of people");
        }else{
            System.out.println(audio.getTitle() + " it's a good and listened by some people");
        }
    }
}
