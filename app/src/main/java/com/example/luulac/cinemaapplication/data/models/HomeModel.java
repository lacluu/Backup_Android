package com.example.luulac.cinemaapplication.data.models;

import java.util.List;

public class HomeModel {
    private List<Film> filmTopSix;

    private List<NewsModel> newTopEight;

    public HomeModel() {
    }

    public List<Film> getFilms() {
        return filmTopSix;
    }

    public void setFilms(List<Film> films) {
        this.filmTopSix = films;
    }

    public List<NewsModel> getNewsList() {
        return newTopEight;
    }

    public void setNewsList(List<NewsModel> newsList) {
        this.newTopEight = newsList;
    }
}
