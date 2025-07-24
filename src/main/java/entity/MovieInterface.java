package entity;

import java.time.LocalDate;

/**
 * A simple implementation of the Movie interface.
 */

public interface MovieInterface {

    /**
     * Returns the movieId of the Movie.
     * @return the movieId of the Movie.
     */
    int getMovieId();

    /**
     * Returns the title of the Movie.
     * @return the title of the Movie.
     */
    String getTitle();

    /**
     * Returns the release date of the Movie.
     * @return the release date of the Movie.
     */
    LocalDate getReleaseDate();

    /**
     * Returns the poster of the Movie.
     * @return the poster of the Movie.
     */
    String getPoster();

    /**
     * Returns the synopsis of the Movie.
     * @return the synopsis of the Movie.
     */
    String getSynopsis();

    /**
     * Returns the runtime of the Movie.
     * @return the runtime of the Movie.
     */
    int getRuntime();

    /**
     * Returns the genre of the Movie.
     * @return the genre of the Movie.
     */
    String getGenre();

    /**
     * Returns the language of the Movie.
     * @return the language of the Movie.
     */
    String getLanguage();

    /**
     * Returns the rentPrice of the Movie.
     * @return the rentPrice of the Movie.
     */
    double getRentPrice();

    /**
     * Returns the buyPrice of the Movie.
     * @return the buyPrice of the Movie.
     */
    double getBuyPrice();
}
