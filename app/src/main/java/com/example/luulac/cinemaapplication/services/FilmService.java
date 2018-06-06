package com.example.luulac.cinemaapplication.services;

import com.example.luulac.cinemaapplication.data.models.Film;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface FilmService {

    @GET("films")
    Call<List<Film>> getFilms();

    @GET("films/{id}")
    Call<Film> getFilm(@Path("id")int id);
}
