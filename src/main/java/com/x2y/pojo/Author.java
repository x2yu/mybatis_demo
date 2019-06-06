package com.x2y.pojo;

import java.util.List;

public class Author {
    private int aid;
    private String aname;
    List<Article> articles;
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "作者id: "+aid+"--"+"作者姓名: "+aname;
    }
}
