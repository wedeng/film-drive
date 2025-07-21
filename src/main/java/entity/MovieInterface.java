package entity;

/**
 * The representation of a Movie in our program.
 */

public interface MovieInterface {

    /**
     * Returns the id of the Movie.
     * @return the id of the Movie.
     */
    int getId();

    /**
     * Returns the title of the Movie.
     * @return the title of the Movie.
     */
    String getTitle();

    /**
     * Returns the posterPath of the Movie.
     * @return the posterPath of the Movie.
     */
    String getPosterPath();

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
