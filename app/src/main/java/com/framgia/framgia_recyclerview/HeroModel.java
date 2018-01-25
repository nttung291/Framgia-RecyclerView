package com.framgia.framgia_recyclerview;

/**
 * Created by nttungg on 1/24/18.
 */

public class HeroModel {
    private String heroName ;
    private String image;

    public HeroModel() {

    }

    public HeroModel(String heroName, String image) {
        this.heroName = heroName;
        this.image = image;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getImage() {
        return image;
    }
}
