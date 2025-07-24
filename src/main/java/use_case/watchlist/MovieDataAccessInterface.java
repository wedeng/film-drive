package use_case.watchlist;

import entity.Movie;
import entity.AppUser;
import use_case.note.DataAccessException;
import java.util.List;

public interface MovieDataAccessInterface {
    List<Movie> searchMovies(String query) throws DataAccessException;
    void addToSavedMovies(AppUser user, int movieId) throws DataAccessException;
    AppUser getCurrentUser() throws DataAccessException;
    void updateUser(AppUser user) throws DataAccessException;
}
