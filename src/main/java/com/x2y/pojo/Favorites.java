package com.x2y.pojo;

import java.util.List;

public class Favorites {
    private int fid;
    private String fname;
    List<FavoritesItems>favoritesItems;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public List<FavoritesItems> getFavoritesItems() {
        return favoritesItems;
    }

    public void setFavoritesItems(List<FavoritesItems> favoritesItems) {
        this.favoritesItems = favoritesItems;
    }
}
