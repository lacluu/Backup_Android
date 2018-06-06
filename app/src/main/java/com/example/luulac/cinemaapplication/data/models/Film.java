package com.example.luulac.cinemaapplication.data.models;

public class Film {
    public int filmId;
    public String name;
    public String dateRelease;
    public int restricted;
    public int filmLength ;
    public double imdb ;
    public String digTypeId ;
    public String author ;
    public String movieGenre ;
    public String filmContent ;
    public String actorList ;
    public String countries ;
    public String trailerLink;
    public String posterPicture;
    public String additionPicture ;
    public int filmStatus ;

    public Film() {
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    public int getRestricted() {
        return restricted;
    }

    public void setRestricted(int restricted) {
        this.restricted = restricted;
    }

    public int getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(int filmLength) {
        this.filmLength = filmLength;
    }

    public double getImdb() {
        return imdb;
    }

    public void setImdb(double imdb) {
        this.imdb = imdb;
    }

    public String getDigTypeId() {
        return digTypeId;
    }

    public void setDigTypeId(String digTypeId) {
        this.digTypeId = digTypeId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getFilmContent() {
        return filmContent;
    }

    public void setFilmContent(String filmContent) {
        this.filmContent = filmContent;
    }

    public String getActorList() {
        return actorList;
    }

    public void setActorList(String actorList) {
        this.actorList = actorList;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getPosterPicture() {
        return posterPicture;
    }

    public void setPosterPicture(String posterPicture) {
        this.posterPicture = posterPicture;
    }

    public String getAdditionPicture() {
        return additionPicture;
    }

    public void setAdditionPicture(String additionPicture) {
        this.additionPicture = additionPicture;
    }

    public int getFilmStatus() {
        return filmStatus;
    }

    public void setFilmStatus(int filmStatus) {
        this.filmStatus = filmStatus;
    }
}
