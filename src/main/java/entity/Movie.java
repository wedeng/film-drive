package entity;

import java.time.LocalDate;

/**
 * The representation of a Movie for our program.
 */

public class Movie implements MovieInterface {
    private int movieId;

    private final String title;
    private final LocalDate releaseDate;
    private String poster;
    private String synopsis;
    private final int runtime;
    private final String genre;
    private final String language;

    private double rentPrice;
    private double buyPrice;

    public Movie(int movieId, String title, LocalDate releaseDate, String poster,
                 String synopsis, int runtime, String genre,
                 String language, double rentPrice, double buyPrice) {

        this.movieId = movieId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.poster = poster;
        this.synopsis = synopsis;
        this.runtime = runtime;
        this.genre = genre;
        this.rentPrice = rentPrice;
        this.buyPrice = buyPrice;
        this.language = language;
    }

    @Override
    public int getMovieId() {
        return this.movieId;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public LocalDate getReleaseDate() {
        return this.releaseDate;
    }

    @Override
    public String getPoster() {
        return this.poster;
    }

    @Override
    public String getSynopsis() {
        return this.synopsis;
    }

    @Override
    public int getRuntime() {
        return this.runtime;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public double getRentPrice() {
        return this.rentPrice;
    }

    @Override
    public double getBuyPrice() {
        return this.buyPrice;
    }
}
