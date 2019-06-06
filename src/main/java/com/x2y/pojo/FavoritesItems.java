package com.x2y.pojo;

public class FavoritesItems {
    private int fiid;
    private Favorites favorites;
    private Article article;

    public int getFiid() {
        return fiid;
    }

    public void setFiid(int fiid) {
        this.fiid = fiid;
    }

    public Favorites getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorites favorites) {
        this.favorites = favorites;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
