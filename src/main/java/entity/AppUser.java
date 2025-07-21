package entity;

import java.util.List;
import java.util.Map;

/**
 * The representation of a AppUser for our program.
 */

public class AppUser implements AppUserInterface {
    private final int tmdbAccountID;
    private String username;

    private Map<Integer, Integer> ratedMovies;
    private List<String> preferredGenres;
    private List<Integer> savedMovies;

    public AppUser(int tmdbAccountID, String username,
                   Map<Integer, Integer> ratedMovies, List<String> preferredGenres,
                   List<Integer> savedMovies) {
        this.tmdbAccountID = tmdbAccountID;
        this.username = username;
        this.ratedMovies = ratedMovies;
        this.preferredGenres = preferredGenres;
        this.savedMovies = savedMovies;
    }

    @Override
    public int getTmdbAccountID() {
        return this.tmdbAccountID;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public Map<Integer, Integer> getRatedMovies() {
        return this.ratedMovies;
    }

    @Override
    public List<String> getPreferredGenres() {
        return this.preferredGenres;
    }

    @Override
    public List<Integer> getSavedMovies() {
        return this.savedMovies;
    }
}
