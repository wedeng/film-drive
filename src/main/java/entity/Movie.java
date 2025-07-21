package entity;

/**
 * The representation of a movie for our program.
 */

public class Movie implements MovieInterface {
    private int id;
    private final String title;
    private String posterPath;
    private String synopsis;
    private final int runtime;
    private final String genre;
    private final String language;
    private double rentPrice;
    private double buyPrice;

    public Movie(int id, String title, String posterPath,
                 String synopsis, int runtime, String genre,
                 String language, double rentPrice, double buyPrice) {
        this.id = id;
        this.title = title;
        this.posterPath = posterPath;
        this.synopsis = synopsis;
        this.runtime = runtime;
        this.genre = genre;
        this.rentPrice = rentPrice;
        this.buyPrice = buyPrice;
        this.language = language;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getPosterPath() {
        return this.posterPath;
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
